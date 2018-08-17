package nice.scalanice

object ClosureDemo extends App {
  val a = (a: Int) => {
    (b: Int) =>
      {
        a + b;
      }
  }
  println(a(1)(2))

  def a1(y: Int => Int) = y(1);
  def c2(z: Int, z1: Int => Int) = z1;
  val c1 = (x: Int) => x + 10;
  println(a1(c1));

}
