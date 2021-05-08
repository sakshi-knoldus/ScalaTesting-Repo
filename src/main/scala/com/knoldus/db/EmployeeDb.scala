package com.knoldus.db
import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class EmployeeDb{
   
    val emp1: Employee= Employee("Sakshi","malik",21,0,"Intern","Knoldus","abc@knoldus.com")
    val emp2: Employee= Employee("abc","",21,0,"Intern","Knoldus","abc@knoldus.com")  
    val emp: HashMap[String, Employee] = HashMap("emp1" -> emp1, "emp2" -> emp2)
   
}