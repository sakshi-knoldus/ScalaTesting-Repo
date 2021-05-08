import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.validator.Palindrome

class PalindromeTest extends AnyFlatSpec {
  "Palindrome" should "valid" in {
    val palindrome= new Palindrome()
    assert(palindrome.check_palindrome("abccba") == true)
    assert(palindrome.check_palindrome("abc") == false)
    assert(palindrome.check_palindrome("aa nn aa") == true)
  }

}
