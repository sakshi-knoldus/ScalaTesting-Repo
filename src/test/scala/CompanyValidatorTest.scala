import org.scalatest.flatspec.AnyFlatSpec

class CompanyValidatorTest extends AnyFlatSpec {
    "Company Name" should "exits" in{
         val obj =new CompanyValidator()
         var company =new Company("Knoldus","abc@gmail.com","noida");
        assert(obj.companyisValid(company)==true)
    }
}