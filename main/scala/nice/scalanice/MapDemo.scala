package nice.scalanice

object MapDemo extends App {
  val map = Map((1, "One"), (2, "Two"), (3, "Three"));
  val map1 = Map((4, "Four"), (5, "Five"), (6, "Six"));

  println(map.head);
  println(map.keys);
  println(map.keySet);
  println("--------")
  println(map.size);
  map.keysIterator.foreach(f => println(f));
  println("--------")
  map.values.foreach(f => println(f));
  println(map.isEmpty)
  println(map.nonEmpty)
  println(map.drop(1))
  println(map(3));
  //println(map(4)); // will give error
  println(map.get(4)); // will return None
  println(map.values.toList);
  println(map1 ++ map);
  println(map1 contains 1);
}