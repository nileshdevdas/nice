package nice.scalanice
// a. Thread /Runnable and Future
// b. Thread with Executors (ConcurrencyApi)
// c. Futures implementations
// d. The Akka APi

class PrintThread extends Runnable {
  def run() {
    val a = 1 to 1000;
    a.foreach(f => {
      println(Thread.currentThread());
      Thread.sleep(10);
    });
  }
}

object ThreadDemo extends App {
  val thread1 = new Thread(new PrintThread());
  val thread2 = new Thread(new PrintThread());
  val thread3 = new Thread(new PrintThread());
  thread1.start();
  thread2.start();
  thread3.start();
}