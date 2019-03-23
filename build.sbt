name := "spark-nlp-example"

version := "0.1"

scalaVersion := "2.11.8"

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.0.4" % "test",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test",
  "org.scala-lang" % "scala-reflect" % "2.11.8",
  "org.apache.spark" % "spark-mllib_2.11" % "2.4.0" % "provided"
)
