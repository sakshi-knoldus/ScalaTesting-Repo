package com.knoldus.validator
import scala.util.matching.Regex

class EmailValidator {

  def isValid(emailId: String): Boolean = {
    val regex= new Regex("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])@(?=.*[a-z])(?=.*[A-Z])(.com|.net|.gov)")
    if((regex findAllIn emailId ).length>0) return true
    else return false
  }
}
object Main{
  def main(args:Array[String]):Unit={
  val obj = new EmailValidator()
  println(obj.isValid("1qwAhhj99@gmail.com"))
  

  }
}

