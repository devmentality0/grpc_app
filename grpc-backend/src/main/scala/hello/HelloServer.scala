package hello

import scalapb.zio_grpc.{ServerMain, ServiceList}

object HelloServer extends ServerMain {
  override def port: Int = 9090

  override def services: ServiceList[zio.ZEnv] = ServiceList.add(HelloImpl)
}
