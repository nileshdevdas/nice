package nice.scalanice

object RightAssociative extends App {

  class Test(x: Int) {
    def ~:(y: Int) = x + y;
  }

  val test = new Test(100);
  println(new Test(5).~:(10))
  //println(test ~: 10)
  // right associative way of calling method
  // that ends with : using the infix method invocation
  test.~:(20);
  ///--------->
  println(5 ~: test);
  ///  <---------// object is on right then comes the method 
  /// then comes the parameter 
  // onbject method param 
  /// param method object 
  println(5 ~: new Test(10)) // right associative
}