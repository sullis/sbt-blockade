
import verizon.build._

scalaVersion := "2.10.4"

libraryDependencies += "org.scodec" %% "scodec-core" % "1.10.0"

blockadeUris := Seq(new java.net.URI(s"file:///${baseDirectory.value}/blockade.json"))

blockadeFailTransitive := true
