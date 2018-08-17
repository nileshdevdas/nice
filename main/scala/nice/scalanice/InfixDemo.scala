package nice.scalanice
class Accounts {
  def calculate(string: String) = {}
}
class Lets {
  def assign(task: Assignment) = new Assignment();
}
class Assignment {
  def to(user: Worker) = {}
}
class Worker {
}
object InfixDemo2 extends App {
  val lets = new Lets();
  val assignment = new Assignment();
  val nilesh = new Worker()

  lets assign assignment to nilesh

  val accounts = new Accounts();
  accounts calculate "salary";
  accounts calculate "discount";
}



