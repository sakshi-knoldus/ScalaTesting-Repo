package com.knoldus.validator
import com.knoldus.models.Company 
import com.knoldus.db.CompanyReadDto 

// Attempt the group 2 Assignment
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
