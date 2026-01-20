import sbt.*

object Dependencies {
  // versions
  lazy val scalatestVersion = "3.2.19"

  // libraries
  val scalatest = "org.scalatest" %% "scalatest" % scalatestVersion % Test

  // projects
  val backendDeps = Seq(scalatest)
}
