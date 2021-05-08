import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.validator.Factorial

class FactorialTest extends AnyFlatSpec {
  "factorial" should "handle StackOverflowError" in {
    val fact = new Factorial()
    assert(fact.factorial(5)==120)
    assert(fact.factorial(12)==479001600)
   assert(fact.factorial(20)==BigInt("2432902008176640000"))
  } 
//  it should "throw NoSuchElementExpected if the input value is 0 or negative" in {
//    val fact = new Factorial()
//    assertTypeError[NoSuchElementExpection] {
//      fact.factorial(-5)
//    }
//  }

}