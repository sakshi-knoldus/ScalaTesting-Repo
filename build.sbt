name := "UT-IT"

version := "0.1"

scalaVersion := "2.13.4"

// https://mvnrepository.com/artifact/org.mockito/mockito-scala
libraryDependencies += "org.mockito" %% "mockito-scala" % "1.16.37" % Test

// https://mvnrepository.com/artifact/org.typelevel/discipline-scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % "test"

// https://mvnrepository.com/artifact/org.scalactic/scalactic
// libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.0-M1"
// https://mvnrepository.com/artifact/org.scalactic/scalactic
// libraryDependencies += "org.scalactic" %% "scalactic" % "3.3.0-SNAP3"
//addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.12")