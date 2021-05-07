
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest._

class PasswordValidator extends AnyFlatSpec{
  "PasswordValidator" should "validate" in{
    val obj = new PasswordValidator()
    assert(obj.isValid("1Ahjj2"==false))
    assert(obj.isValid("Agjjj1234@3"==true))
  }
}