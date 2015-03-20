package com.bthuillier

import akka.actor.ActorSystem
import akka.http.Http
import akka.http.model._
import akka.stream.ActorFlowMaterializer
import akka.stream.scaladsl.{Keep, Sink}

trait Routes {
  import akka.http.server.Directives._
  def routes = path("toto") {
      complete {
        HttpResponse(StatusCodes.OK, Nil, "")
      }
    }
}


object HttpApp extends App with Routes {
  implicit val system = ActorSystem("ServerTest")
  import system.dispatcher
  implicit val materializer = ActorFlowMaterializer()

  val f = Http(system).bind(interface = "0.0.0.0", port = 8080).
    toMat(Sink.foreach(_.handleWith(routes)))(Keep.left).run()(materializer)

}
