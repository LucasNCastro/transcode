name := """si_transcode"""

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  jdbc,
  javaEbean,
  "org.postgresql" % "postgresql" % "9.4-1202-jdbc4",
  "org.webjars" % "jquery" % "2.1.1",
  "org.webjars" % "bootstrap" % "3.3.1"
)     

lazy val root = (project in file(".")).enablePlugins(PlayJava)
