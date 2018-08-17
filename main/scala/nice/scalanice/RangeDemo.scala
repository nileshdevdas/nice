package nice.scalanice

object RangeDemo extends App {
  val r = 1 to 100;
  val al = Range.apply(1, 100) ;
  r.foreach(f => println(f));
  al.foreach(f => println(f));
  println(al.size)
  println(al.min);
  println(al.max); 
  println(al.start)
  println(al.end);
  println(al.sum)
  println(al.distinct);
  println(al.reverse);
}