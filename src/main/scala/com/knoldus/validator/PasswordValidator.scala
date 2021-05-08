package com.knoldus.validator
import scala.util.matching.Regex

class PasswordValidator{
      def isValid(password:String):Boolean={
       val regex= new Regex("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&*()_+=]).{8,15}")
       println((regex findAllIn password))
        if((regex findAllIn password).length>0) return true
        return false
      }
}
