
import github.com.cclient.Corpus
import org.apache.spark.mllib.clustering.LDA
import org.apache.spark.mllib.linalg.Vectors
import org.apache.spark.{SparkConf, SparkContext}
import org.scalatest._


/**
  * Created by cclient on 23/03/2019.
  */

class Lda extends FlatSpec with BeforeAndAfter {
  val master = "local"
  var sc: SparkContext = _
  it should ("test success") in {
    val coreNum=3
    val termNum=10
    //nlp segment(spark RegexTokenizer doesn't work on chinese)
    val docs=Corpus.getResourcesContent("docs")
    val corpus=sc.parallelize(docs)
    val docWords=corpus.map(_.split(" ").filter(_.size>1));
    //term: word->count
    val wordsMap=docWords
      .aggregate[Map[String,Int]](Map[String,Int]())(
      (left,right)=>Corpus.MapListMerge(left,right),
      (leftMap,rightMap)=>Corpus.MapMapMerge(leftMap,rightMap))
    //term: word->index
    val wordIndexMap=wordsMap.map(_._1).zipWithIndex.toMap
    //term: index->word
    val indexWordMap=wordIndexMap.map(term=>(term._2,term._1))
    println("wordsMap")
    println(wordsMap.mkString(","))
    println("wordIndex")
    println(wordIndexMap.mkString(","))
    println("indexWord")
    println(indexWordMap.mkString(","))
    //init vectors
    val vectors=docWords.map(doc=>{
      val numArr = doc.map(wordIndexMap(_).toDouble)
      Vectors.dense(numArr)
    })
    //lda
    val ldaModel = new LDA().setK(coreNum).run(vectors.zipWithIndex.map(_.swap))
    val topicIndices = ldaModel.describeTopics(maxTermsPerTopic = termNum)
    val topics = topicIndices.map { case (terms, termWeights) =>
      terms.zip(termWeights).map { case (term, weight) => (indexWordMap(term.toInt), weight) }
    }
    println(s" topics:")
    topics.zipWithIndex.foreach { case (topic, i) =>
      println(s"TOPIC $i")
      topic.foreach { case (term, weight) =>
        println(s"$term\t$weight")
      }
      println()
    }
  }

  before {
    val conf = new SparkConf()
      .setAppName("lda").setMaster(master)
    sc = new SparkContext(conf)
  }

  after {
    if (sc != null) {
      sc.stop()
    }
  }
}