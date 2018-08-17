package nice.scalanice
import scala.concurrent._
// using the global pool//
import ExecutionContext.Implicits.global
import scala.util._;
import scala.concurrent.duration._;
import java.util.concurrent.Executors

object FuturesDemo extends App {
  var isCompleted = false;
  //val executors = Executors.newFixedThreadPool(100);
  val f = Future {
    println(Thread.currentThread());
    1 + 1
  }
  //(ExecutionContext.fromExecutor(executors))
  // non blocking code
  f.onComplete({
    case Success(t) => println(Thread.currentThread()); println(t);
    case Failure(e) => println(Thread.currentThread()); println(e);
  })
  //(ExecutionContext.fromExecutor(executors))
  /// method based FUture
  //(ExecutionContext.fromExecutor(executors))
  def loginRunning2 = {
    println(Thread.currentThread());
    Thread.sleep(10000);
    println("exited");
    1;
  }

  loginRunning2
  println("Launching the next");
  def longRunning: Future[Int] = Future {
    println(Thread.currentThread());
    Thread.sleep(10000);
    100;
  }
  println("Launching the next++");
  longRunning.onComplete({
    case Success(res) => println(Thread.currentThread()); println(res); isCompleted = true;
    case Failure(err) => println(err); isCompleted = true;
  })
  //(ExecutionContext.fromExecutor(executors));

  println(Thread.currentThread());

  while (isCompleted != true) {
    Thread.sleep(100)
  }
}