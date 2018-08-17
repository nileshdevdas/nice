package nice.scalanice
import scala.xml._;
object XMLDemo extends App {
  val books =
    <books>
      <book>
        <author>J K Rowling</author>
        <title isbn="2094949949">Harry Potter</title>
      </book>
      <book>
        <author>J K Rowling</author>
        <title isbn="2094949949">Harry Potter</title>
      </book>
      <book>
        <author>J K Rowling</author>
        <title isbn="2094949949">Harry Potter</title>
      </book>
      <book>
        <author>J K Rowling</author>
        <title isbn="2094949949">Harry Potter</title>
      </book>
    </books>

  val author = books \ "book" \ "author"
  val title = books \ "book" \ "title"
  val isbn = books \ "book" \ "title" \\ "@isbn"
  val book = books \ "book"
  println(book.length);
  println(author.text);
  println(title.text);
  println(isbn);
}