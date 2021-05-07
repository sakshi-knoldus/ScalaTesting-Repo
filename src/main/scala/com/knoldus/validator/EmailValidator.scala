package com.knoldus.validator
import scala.util.matching.Regex
 import com.knoldus.db.CompanyReadDto 

class EmailValidator {

  def isValid(emailId: String): Boolean = {
   if("""(?=[^\s]+)(?=(\w+)@([\w\.]+))""".r.findFirstIn(emailId) == None) false
     else true
  }
  // to check if it also exit in our database
  def exitInDb(emailId: String): Boolean = {
   val cmp= new CompanyReadDto()
    for((key,value)<-cmp.companies){
      if( value.emailId == emailId )  
      return true
    }
    return false
  }
}
object Main{
  def main(args:Array[String]):Unit={
  val obj = new EmailValidator()
  println(obj.isValid("1qwAhhj99@gmail.com"))
  println(obj.exitInDb("1qwAhhj99@gmail.com"))
  

  }
}

