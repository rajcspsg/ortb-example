package forscala

import io.circe.{Decoder, HCursor}

case class Device (ua: String, dnt: Option[Int], ip: Option[String], devicetype: Option[Int], addlProperties: Map[String, Any] = Map.empty)

object Device {
  implicit val decodeFoo: Decoder[Device] = new Decoder[Device] {
    final def apply(c: HCursor): Decoder.Result[Device] =
      for {
        ua <- c.downField("ua").as[String]
        dnt <- c.downField("dnt").as[Option[Int]]
        ip <- c.downField("ip").as[Option[String]]
        devicetype <- c.downField("devicetype").as[Option[Int]]
      } yield new Device(ua, dnt, ip, devicetype)
  }
}
