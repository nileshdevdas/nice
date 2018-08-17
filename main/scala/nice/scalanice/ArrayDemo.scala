package nice.scalanice

object ArrayDemo extends App {
  val array = Array(1, 2, 3, 4);
  println(array);
  println(array.head);
  println(array.tail);
  println(array(3));
  println(array.max);
  
  // repeated parameters or varargs
  def rp(a:Int*)={
      a.iterator.foreach(f=>println(f))
  }
  
  rp(1,2,3,4,5)
}