name := "Face Detection"

version := "0.1"

scalaVersion := "2.12.3"



libraryDependencies += "org.openpnp" % "opencv" % "3.2.0-0"
libraryDependencies += "junit" % "junit" % "4.12"


javaSource in Compile := baseDirectory.value/"src"
javaSource in Test := baseDirectory.value/"test"

unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/ext/jfxrt.jar"))


resourceDirectory in Compile := baseDirectory.value / "src"
resourceDirectory in Test := baseDirectory.value / "src"