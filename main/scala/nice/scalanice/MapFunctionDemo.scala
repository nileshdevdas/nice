package nice.scalanice

object MapFunctionDemo extends App {
  val a = List(1, 2, 3, 4);
  val b = List("nilesh", "suresh", "ramesh", "satish");
  println(a.map(f => "<div>" + f + "</div>"));
}