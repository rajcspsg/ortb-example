ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "ortb-example",
    libraryDependencies ++= Seq(
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.13.2.2",
      "com.fasterxml.jackson.core" % "jackson-annotations" % "2.13.2",
      "io.circe" %% "circe-parser" % "0.14.1",
      "io.circe" %% "circe-generic" % "0.14.1"
    )
  )
