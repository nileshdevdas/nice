package nice.scalanice

object TuplesDemo extends App {

  def mytp() = {
    (1, 2, 3)
  }
  val mytuples = (1, "Nilesh", 20.0d)

  println(mytuples._1)
  println(mytuples._2)
  println(mytuples._3)

  mytuples.productIterator.foreach {
    // to get the each tuple printed....
    i => println(i);
  }

  val f = (x: String) => (x, x.length)
  println(f("xxxx"))
  println(mytp());
}