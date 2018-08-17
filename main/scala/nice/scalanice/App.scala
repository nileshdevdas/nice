package nice.scalanice
case class Person(val id: Int, val firstName: String, val lastName: String);
object SampleApp extends App {

  val persons = List[Person](new Person(1, "nilesh", "devdas"), new Person(2, "nilesh", "devdas"), new Person(3, "nilesh", "devdas"), new Person(1, "nilesh", "devdas"), new Person(1, "nilesh", "devdas"));
  for (p <- persons) println(p.firstName);

  val d = persons filter (_.firstName.length == 6)

  val d1 = persons.takeRight(3)
  println(d1);
  val d3 = persons.dropWhile(_.firstName != "nilesh")
  val d4 = persons span (_.firstName == "nilesh");
  val d5 = persons.exists(_.firstName == "nilesh");
  print(d5);

}
