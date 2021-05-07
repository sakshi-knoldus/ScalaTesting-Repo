import org.scalatest.flatspec.AnyFlatSpec

class PalindromeTest extends AnyFlatSpec {
  def check_palindrome(str:String):Boolean={
  for(i<-0 until str.length){
    if(str(i)!=str(str.length-i-1)) return false

  }
  return true
}
}


