import SonatypeKeys._

sonatypeSettings

profileName := "com.hunorkovacs"

organization := """com.hunorkovacs"""

name := """koauth"""

version := "2.0.0-SNAPSHOT"

scalaVersion := "2.12.1"

crossScalaVersions := Seq("2.10.4", "2.11.8")

resolvers ++= Seq(
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/",
  "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.25",
  "org.slf4j" % "slf4j-simple" % "1.7.25" % "test",
  "org.specs2" %% "specs2-core" % "3.8.9",
  "org.specs2" %% "specs2-mock" % "3.8.9"
)

pomExtra := {
  <url>https://github.com/kovacshuni/koauth</url>
    <licenses>
      <license>
        <name>Apache 2</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      </license>
    </licenses>
    <scm>
      <connection>scm:git:github.com/kovacshuni/koauth</connection>
      <developerConnection>scm:git@github.com:kovacshuni/koauth.git</developerConnection>
      <url>github.com/kovacshuni/koauth</url>
      <tag>2.0.x</tag>
    </scm>
    <developers>
      <developer>
        <id>kovacshuni</id>
        <name>Hunor Kovács</name>
        <url>www.hunorkovacs.com</url>
      </developer>
    </developers>
}

publishTo := Some("releases"  at "https://oss.sonatype.org/service/local/staging/deploy/maven2")

publishMavenStyle := true
