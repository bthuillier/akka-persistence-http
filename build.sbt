name := "akka-persistence-http"

version := "1.0"

scalaVersion := "2.11.6"


libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "com.typesafe.akka" %% "akka-persistence-experimental" % "2.3.9",
  "com.typesafe.akka" %% "akka-stream-experimental" % "1.0-M4",
  "com.typesafe.akka" %% "akka-http-experimental" % "1.0-M4",
  "com.typesafe.akka" %% "akka-http-core-experimental" % "1.0-M4"
)
