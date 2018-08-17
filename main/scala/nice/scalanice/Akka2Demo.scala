package nice.scalanice;
import akka.pattern.ask
import akka.util.Timeout
import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import scala.concurrent.Future
import scala.concurrent.duration._;
import scala.concurrent.Await

class TestActor extends Actor {
  def receive = {
    case "Test" => sender ! "Fred"
    case _ => println("that was unexpected")
  }
}
object AskTest extends App {
  val system = ActorSystem("AskTestSystem")
  val myActor = system.actorOf(Props[TestActor], name = "myActor")
  implicit val timeout = Timeout(5 seconds)
  val future = myActor ? "Test"
  val result = Await.result(future, timeout.duration).asInstanceOf[String]
  println(result)

  val future2: Future[String] = ask(myActor, "Test").mapTo[String]
  val result2 = Await.result(future2, 1 second)
  println(result2)

}