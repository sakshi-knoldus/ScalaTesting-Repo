package com.knoldus.validator

class Palindrome{
       def check_palindrome(str:String):Boolean={
            for(i<-0 until str.length/2){
                if(str(i)!=str(str.length-i-1)) return false
            }
            return true
        }
}
