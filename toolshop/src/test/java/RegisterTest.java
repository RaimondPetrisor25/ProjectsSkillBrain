import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.CustomerRegistrationPage;
import pages.LoginPage;
import util.BaseTest;

public class RegisterTest extends BaseTest {

    @Test
    public void registerTest(){
        CustomerRegistrationPage customerRegistrationPage= new CustomerRegistrationPage(driver);
        DataGeneration data = DataGeneration.getInstance();
        LoginPage loginPage= new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        driver.get("https://practicesoftwaretesting.com/auth/register");

         customerRegistrationPage.fillUserinfo(data.firstName, data.lastName,"1994-09-21");
         customerRegistrationPage.fillUserAddress(data.street,data.postalCode,data.city,data.state,data.country, "1234567890");
         customerRegistrationPage.fillUserCredentials(data.email,data.password);
         customerRegistrationPage.clickRegisterButton();


         loginPage.login(data.email,data.password);

        Assert.assertEquals(accountPage.getAccountMenu().getText(), data.firstName + " " + data.lastName);
    }


}
