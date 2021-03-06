
import github.com.cclient.Corpus
import org.apache.spark.ml.clustering.LDA
import org.apache.spark.ml.feature.{CountVectorizer, CountVectorizerModel}
import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}
import org.scalatest._


/**
  * Created by cclient on 27/03/2019.
  */

class LdaOrignal extends FlatSpec with BeforeAndAfter {
  val master = "local"
  var sc: SparkContext = _
  it should ("test success") in {
    val spark = SparkSession
      .builder.getOrCreate()
    val coreNum = 3
    val termNum = 10
    //load documents
    val docs = Corpus.getResourcesContent("docs")
    val corpus = sc.parallelize(docs)
    val docWords = corpus.map(_.split(" ").filter(_.size > 1))
    val docWordsDF = spark.createDataFrame(docWords.zipWithIndex().map(a => (a._2, a._1))).toDF("id", "words")
    //load stopwords
    val cvModel: CountVectorizerModel = new CountVectorizer()
      .setInputCol("words")
      .setOutputCol("features")
      .setVocabSize(100000)
      .setMinDF(1)
      .fit(docWordsDF)
    println("cvModel.vocabulary", cvModel.vocabulary.mkString(","))
    val vectors = cvModel.transform(docWordsDF).select("features")
    val ldaModel = new LDA().setK(coreNum).fit(vectors)
    val topicIndices = ldaModel.describeTopics(maxTermsPerTopic = termNum)
    //output
    val topics = topicIndices.rdd
      .map(a => (a.getAs[Seq[Int]](1), a.getAs[Seq[Double]](2)))
      .map { case (terms, termWeights) =>
        terms.zip(termWeights).map { case (term, weight) => (cvModel.vocabulary(term), weight) }
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