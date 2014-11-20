name := """slick-playground"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.2"

resolvers ++= DefaultOptions.resolvers(snapshot = true)

resolvers += Resolver.typesafeRepo("releases")

resolvers += "scalaz-releases" at "http://dl.bintray.com/scalaz/releases" // specs2 depends on scalaz-stream

libraryDependencies ++= Seq(
  jdbc,
  "com.typesafe.play" %% "play-slick" % "0.9.0-M1"
)
