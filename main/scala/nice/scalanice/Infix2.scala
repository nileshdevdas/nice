package nice.scalanice

class Infix(x: Int) {
  def +(y: Int) = x + y
  def r(y: Int) = new Infix(x + y)
}

object InfixDemo extends App {
  val a = new Infix(10);
  print((a r 10 r 10 r 10 r 10 r 10 r 10 r 10 r 10 )+ 20) ;
}