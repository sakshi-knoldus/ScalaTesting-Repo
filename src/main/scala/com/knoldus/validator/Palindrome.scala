class Palindrome{
       def check_palindrome(str:String):Boolean={
            for(i<-0 until str.length/2){
                if(str(i)!=str(str.length-i-1)) return false
            }
            return true
        }
}
// object Main3{
//   def main(args:Array[String]){
//     val obj =new Palindrome()
//    println(obj.check_palindrome("avnba")) 
 
//   }
// }