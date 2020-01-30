lazy val functionsPiece = (project in file("functions-piece"))

lazy val corePiece = (project in file("core-piece")).dependsOn(functionsPiece)

lazy val root = (project in file("."))
  .settings(
    organization := "com.example",
    name         := "root",
    scalaVersion := "2.12.10",
    version      := "0.1.0-SNAPSHOT"
  )
  .aggregate(corePiece)

