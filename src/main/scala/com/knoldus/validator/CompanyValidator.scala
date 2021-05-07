package com.knoldus.validator

import com.knoldus.models.Company 
import com.knoldus.db.CompanyReadDto 


class CompanyValidator {

  def companyIsValid(company: Company): Boolean = {
    val cmp= new CompanyReadDto()
    for((key,value)<-cmp.companies){
      if( key == company.name )  
      return true
    }
    return false
  }

}
// object Main{
//   def main(args:Array[String]){
//     val obj =new CompanyValidator()
//     var company =new Company("Philips","abc@gmail.com","noida");
//    println(obj.companyIsValid(company))
 
//   }
// }


//test for factorial and check_palindrome


// 1. Write a code and unit test cases to check if a password is valid or not.
//  Only the rules mentioned below needs to be tested:
//     i. Password should not contain any space.
//     ii. Password should contain at least one digit(0-9).
//     iii. Password length should be between 8 to 15 characters.
//     iv. Password should contain at least one lowercase letter(a-z).
//     v. Password should contain at least one uppercase letter(A-Z).
//     vi. Password should contain at least one special character ( @, #, %, &, !, $, etc

// 2. Create an interface with the following methods and a class implementing these methods with unit test
//  cases.
//     i. check if a number is palindrome or not
//     ii. factorial

// 3. Write the unit and integration test cases after completing the implementation of the following classes. 
// The framework has already been created and most of the implementation of methods already exists.

// Add the following validation in respective classes.
//     a) User Validation Class: 
//         i. Checks if company exists in database
//         ii. Checks if email id is valid.

//     b) Company Validation Class: 
//         i. Company should not already exists in database
//         ii. Checks if email id is valid.
//     c) Email Validation Class :
//         i. Checks if email is valid.
       
