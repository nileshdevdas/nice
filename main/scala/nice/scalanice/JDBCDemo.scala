package nice.scalanice;
import slick.driver.MySQLDriver.api._
import scala.util.Success
import scala.util.Failure
import scala.concurrent.ExecutionContext.Implicits.global
/*
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.6</version>
		</dependency>
		<dependency>
			<groupId>com.typesafe.slick</groupId>
			<artifactId>slick_2.12</artifactId>
			<version>3.2.3</version>
		</dependency>
 */
//Entity Class
case class Emp(tag: Tag) extends Table[(Int, String, String)](tag, "Employees") {
  def id = column[Int]("ID", O.PrimaryKey);
  def fname = column[String]("FNAME");
  def lname = column[String]("LNAME");
  def * = (id, fname, lname);
}
object JDBCDemo extends App {
  // DataSource
  val db = Database.forURL("jdbc:mysql://localFhost:3306/test", "root", "root");
  //DAO
  val employees = TableQuery[Emp]
  val setup = DBIO.seq(
    (employees.schema.create),
    employees += (3, "Nilesh", "Devdas"),
    employees += (4, "Nilesh1", "Devdas1"));
  val fut = db.run(setup);
  fut.onComplete({
    case Success(res) => println(res);
    case Failure(err) => println(err);
  })
  // select all
  val fut2 = db.run(employees.result).map(_.foreach {
    case (id, fName, lName) =>
      println(id);
      println(fName);
      println(lName)
  })
  def emp = employees.filter(_.fname === "Nilesh");

  Thread.sleep(10000);
};
