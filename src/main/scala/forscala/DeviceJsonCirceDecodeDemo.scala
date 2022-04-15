package forscala

import scala.io.Source
import io.circe.parser._

object DeviceJsonCirceDecodeDemo extends App {
  val devString = Source.fromFile("src/main/resources/device.json").mkString
  val device = decode[Device](devString)
  println(device)
}
