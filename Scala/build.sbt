name := "Parrot"

version := "1.0"

scalaVersion := "2.10.2"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE16)
EclipseKeys.eclipseOutput := None
