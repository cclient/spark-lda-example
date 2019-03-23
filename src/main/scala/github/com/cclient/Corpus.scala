package github.com.cclient

import scala.reflect.io.{Directory, Path}
import java.io.File

import scala.collection.JavaConversions._
import scala.io.Source
import scala.reflect.io.Directory


object Corpus {

  /**
    * dir files
    * @param name
    * @return
    */
  def getResources(name:String): List[java.io.File] = {
    val classLoader = getClass().getClassLoader()
    val path = classLoader.getResource(name)
    val file = new java.io.File(path.getPath)
    val folder = new Directory(file)
    val files = folder.files.filter(_.isFile)
    files.map(file => new java.io.File(file.path)).toList
  }

  /**
    * files -> list[String]
    * @param name
    * @return
    */
  def getResourcesContent(name:String) ={
    val files=getResources(name)
    files.map(f=>{
      scala.io.Source.fromFile(f).getLines().mkString
    })
  }


  def MapMapMerge[A](orginaleft:Map[A,Int],right:Map[A,Int])={
    var left=orginaleft;
    right.foreach(w=>{
      if(left.contains(w._1)){
        left=left.updated(w._1,left(w._1)+right(w._1))
      }else{
        left=left.+(w._1->w._2)
      }
    })
    left
  }

  def MapListMerge(orginaleft:Map[String,Int],right:Seq[String])={
    var left=orginaleft
    right.foreach(word=>{
      if(left.contains(word)){
        left=left.updated(word,left(word)+1)
      }else{
        left=left.+(word->1)
      }
    })
    left
  }
}
