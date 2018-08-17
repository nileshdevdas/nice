package nice.scalanice
case class Employee(firstName: String, middleName: String, lastName: String) {
  def this(firstName: String, lastName: String) = this(firstName, null, lastName);
}

object Options extends App {
  val middleName = Some("Prakash");
  val middleName2: Option[String] = middleName;
  val middleName3: Some[String] = middleName;
  val noMiddleName = None;
  val nilesh = new Employee("Nilesh", null, "Devdas");
  val nilesh1 = new Employee("Nilesh", "Devdas");
  val john = new Employee("John", "Doe");

  // either getOrElse
  println(nilesh.middleName.toLowerCase());

  /// the pattern matching
  def printMiddleName(x: Option[String]) = {
    x match {
      case Some(name) => name;
      case None => "no middle Name";
    }
  }
}