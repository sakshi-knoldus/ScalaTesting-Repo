
import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.validator.PasswordValidator


class PasswordValidatorTest extends AnyFlatSpec{
  "PasswordValidator" should "validate" in{
    val obj = new PasswordValidator()
    assert(obj.isValid("1Ahjj2")==false)
    assert(obj.isValid("Agjjj1234@3")==true)
  }
}