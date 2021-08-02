package hello


import zio.{UIO, ZIO}
import hello.ZioHello.HelloService
import hello.{HelloRequest, HelloResponse}


object HelloImpl extends HelloService {
  override def sayHello(request: HelloRequest): UIO[HelloResponse] = {
    ZIO.succeed(HelloResponse(message = s"Hello, ${request.message}"))
  }
}
