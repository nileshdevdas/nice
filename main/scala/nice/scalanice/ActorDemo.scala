package nice.scalanice;
import org.slf4j.LoggerFactory;
import akka.pattern.ask
import akka.util.Timeout
import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import scala.concurrent.Future
import scala.concurrent.duration._;
import scala.concurrent.Await

import ch.qos.logback.core.util.StatusPrinter
import ch.qos.logback.classic.LoggerContext;

class MyAction extends Actor {

  val lc = LoggerFactory.getILoggerFactory().asInstanceOf[LoggerContext];
  val logger = lc.getLogger("")
  StatusPrinter.print(lc);

  def receive() = {
    case "Hello" => process();
    case "Hello2" => process2();
    case _ => logger.info("Not a valid action")
  }
  def process() = {
    logger.info("process()");
    sender ! "sending a response........"
  }
  def process2() = {
    logger.info("process2()");
    sender ! "sending a response........"
  }
}

object ActorDemo extends App {
  val lc = LoggerFactory.getILoggerFactory().asInstanceOf[LoggerContext];
  val logger = lc.getLogger("")
  StatusPrinter.print(lc);
  val system = ActorSystem("MySystem");
  val actor = system.actorOf(Props[MyAction], name = "myActor");
  implicit val timeout = Timeout(5 seconds)
  ask(actor, "Hello")(timeout.duration);
  val f = actor ? "Hello"
  val f2 = actor ? "Hello2"
  val result = Await.result(f, timeout.duration).asInstanceOf[String]
  logger.info(result);
  system.terminate();
}

