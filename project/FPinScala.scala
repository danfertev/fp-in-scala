import sbt._
import sbt.Keys._

object FPinScala extends Build {
  lazy val app = Project(
    "fp-in-scala",
    file("."),
    settings = Defaults.defaultSettings ++ Seq(
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.2",
      libraryDependencies ++= Seq(
        "org.specs2" %% "specs2" % "2.2.3" % "test"
      )
    )
  )
}