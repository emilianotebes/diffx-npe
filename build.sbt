name := "diffx-npe"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.2"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % "test"

libraryDependencies += "com.softwaremill.diffx" %% "diffx-scalatest" % "0.4.0" % Test
