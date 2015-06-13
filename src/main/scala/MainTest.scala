
import slick.driver.PostgresDriver.api._


/**
 * Class .MainTest
 * Created by vishnu667 on 12/6/15.
 *
 * TODO check  http://queirozf.com/entries/scala-slick-simple-example-on-connecting-to-a-postgresql-database
 *
 */
object MainTest {

  class Users(tag: Tag) extends Table[(Int, String)](tag, "users") {
    def id = column[Int]("id")
    def username = column[String]("username")
    def * = (id, username)
  }

  def main(args: Array[String]) {
    println("Starting test application")

    val connectionUrl = "jdbc:postgresql://localhost/postgres?user=postgres&password=postgres"

    Database.forURL(connectionUrl, driver = "org.postgresql.Driver") withSession {
      implicit session =>
        val users = TableQuery[Users]

    }
    println("Exiting test application")
  }
}
