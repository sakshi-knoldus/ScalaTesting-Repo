import org.scalatest.flatspec.AnyFlatSpec

class FactorialTest extends AnyFlatSpec {
  "factorial" should "handle StackOverflowError" in {
    val fact = new Factorial()
    assert(fact.factorial(5)==100)
    assert(fact.factorial(12)==479001600)
    assert(fact.factorial(20)==2432902008176640000)
  } 
  // it should "throw NoSuchElementExpected if the input value is 0 or negative" in {
  //   val fact = new Factorial()
  //   assertThrows[NoSuchElementExpection] {
  //     fact.factorial(-5)
  //   }
  // }

}