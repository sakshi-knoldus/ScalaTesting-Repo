import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator

class CompanyValidatorTest extends AnyFlatSpec {
    "Company Name" should "exits" in{
         val companyObject = new CompanyValidator()
         val company =new Company("Knoldus","abc@gmail.com","noida");
        assert(companyObject.companyIsValid(company)==true)
    }
}