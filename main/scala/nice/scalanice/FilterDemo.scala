package nice.scalanice

object FilterDemo extends App {

  val countries = List("India", "USA", "China", "Chile", "Japan");
  val f = countries filter { x => x.contains("i") }
  println(f);

  val g = countries filterNot { x => x.contains("i") }
  println(g);

  val i = countries exists {x => x == "India"}
  print(i);
}