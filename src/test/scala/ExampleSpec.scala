import com.softwaremill.diffx.generic.auto._
import com.softwaremill.diffx.scalatest.DiffMatcher._
import org.scalatest.flatspec._
import org.scalatest.matchers._

case class Person(name: String, mail: String = null)

class ExampleSpec extends AnyFlatSpec with should.Matchers {

  "When comparing null against some value" should "not throw NullPointerException" in {
    val p0 = Person("Jose")
    val p1 = Person("Juan", "juan@example.com")

    p0 should matchTo(p1)
  }

}