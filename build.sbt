name := "tvcm-app"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies  ++= Seq(
  "org.scalanlp" %% "breeze" % "0.11.2",
  "org.scalanlp" %% "breeze-natives" % "0.11.2",
  "org.scalanlp" %% "breeze-viz" % "0.11.2",
  "org.specs2" %% "specs2-core" % "3.6.6" % "test"
)

resolvers ++= Seq(
  "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
)

scalacOptions in Test ++= Seq("-Yrangepos")