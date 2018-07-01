organization := "org.longevityframework"
name         := "sbt-longevity-migrations"
version      := "0.2.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

sbtPlugin          := true
crossSbtVersions   := Vector("0.13.17", "1.1.6")

ScriptedPlugin.scriptedSettings
scriptedBufferLog  := false
scriptedLaunchOpts += "-Dplugin.version=" + version.value
scriptedLaunchOpts += "-Dlongevity.version=0.27.0"

publishMavenStyle := true
pomIncludeRepository := { _ => false }
publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
licenses := Seq("Apache License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))
homepage := Some(url("http://longevityframework.org/"))
pomExtra := (
  <scm>
    <url>git@github.com:longevityframework/sbt-longevity-migrations.git</url>
    <connection>scm:git:git@github.com:longevityframework/sbt-longevity-migrations.git</connection>
  </scm>
  <developers>
    <developer>
      <id>sullivan-</id>
      <name>John Sullivan</name>
      <url>https://github.com/sullivan-</url>
    </developer>
  </developers>)
