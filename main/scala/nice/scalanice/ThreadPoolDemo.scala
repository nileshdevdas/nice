package nice.scalanice

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class PrintThread2 extends Runnable {
  def run() {
    println(Thread.currentThread());
    Thread.sleep(5000);
  }
}

object ThreadPoolDemo extends App {
  val executors = Executors.newFixedThreadPool(100);
  var i = 0;
  while (i != 200) {
    executors.execute(new PrintThread2());
    i = i + 1;
  }
  executors.shutdown();
}