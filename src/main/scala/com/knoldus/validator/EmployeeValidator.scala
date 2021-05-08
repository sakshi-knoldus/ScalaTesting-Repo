package com.knoldus.validator
 import com.knoldus.db.EmployeeDb
import com.knoldus.models.Employee

class EmployeeValidator {
    def employeeIsValid(employee:Employee):Boolean ={
    val obj= new EmployeeDb()
      for((key,value)<-obj.emp){
        if( value== employee)  
        return true
      }
      return false
    }
    
}
object Main1{
    val emp2: Employee= new Employee("abc","",21,0,"Intern","Knoldus","abc@knoldus.com")
   val obj = new EmployeeValidator()
    println(obj.employeeIsValid(emp2))
}
