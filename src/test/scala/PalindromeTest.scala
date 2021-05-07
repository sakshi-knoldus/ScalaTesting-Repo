import org.scalatest.flatspec.AnyFlatSpec

class PalindromeTest extends AnyFlatSpec {
  "Palindrome" should "valid" in {
    val obj = new Palindrome()
    assert(obj.check_palindrome("abccba")==true)
    assert(obj.check_palindrome("abc")==false)
    assert(obj.check_palindrome("aa nn aa")==true)
  } 


