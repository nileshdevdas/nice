package nice.scalanice

object App2 extends App {
  val tasks = new Task("Collect Passport");
  val lets = new Let(tasks);
  val ramesh = new User("Ramesh");
  
  lets.add(tasks).to(ramesh);
  
  lets add tasks to ramesh;
}

case class Let(task: Task) {
  def add(task: Task) = new Task(task.task)
}

case class Task(task: String) {
  def to(user: User) = new Task(task);
}
case class User(name: String) {
}

class Supervisor {
}
