package nice.scalanice

object ListDemo extends App {
  val a = List(1, 2, 3, 4, 1, 1, 1);
  val b = List(7, 8, 10, 12, 1, 2);

  println(a.tail);
  println(a.head);
  println(a.max);
  println(a.min);
  println(a.nonEmpty)
  println(a.isEmpty);
  // unit mapping
  val d = a filter (p => p > 3)
  // unit mapping
  val d1 = a filter (_ > 3)

  println(d);
  val c = a.takeWhile(_ < 4)
  val x: Int = 10;
  print(c);
  println(a.updated(3, 100));
  println(a ++ b);
  println((a ++ b) distinct);
  println(a.groupBy(f => f == 1));
  println(a union b);
  println(a intersect b);
  println(a exists { p => p == 1231 });
  println(b filter { p => p > 10 });

}