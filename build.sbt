name := """si_transcode"""

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  jdbc,
  javaEbean,
  "org.postgresql" % "postgresql" % "9.4-1202-jdbc4",
  "org.webjars" % "jquery" % "2.2.3",
  "org.webjars" % "bootstrap" % "3.3.6"
/*  "com.typesafe.akka" %% "akka-actor"   % "2.3.15",
  "com.typesafe.akka" %% "akka-slf4j"   % "2.3.15",
  "com.typesafe.akka" %% "akka-remote"  % "2.3.15",
  "com.typesafe.akka" %% "akka-agent"   % "2.3.15",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.15" % "test"*/
)     

lazy val root = (project in file(".")).enablePlugins(PlayJava)
