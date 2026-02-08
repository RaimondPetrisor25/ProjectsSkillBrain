import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import util.BaseTest;
import util.TestListeners;


    @Listeners(TestListeners.class)
    public class BuyProductTest extends BaseTest {

        @Test
        public void buyProductTest() throws InterruptedException {
        //deschidem pagina principala
        //deschidem un produs
        //il adaugam in cos
        //deschidem cosul
        //click pe proceed to checkout
        //al doilea click pe proceed to checkout
        //al treilea click pe proceed to checkout
        //selectam o metoda de plata(cash on delivery)
        //verificam payment successful


        driver.get("https://practicesoftwaretesting.com/auth/login");

            DataGeneration data = DataGeneration.getInstance();

            LoginPage loginPage = new LoginPage(driver);
            AccountPage accountPage = new AccountPage(driver);
            HomePage homePage = new HomePage(driver);
            ProductPage productPage = new ProductPage(driver);
            CartPage cartPage = new CartPage(driver);



            loginPage.login(data.email, data.password);
            Thread.sleep( 1500);


            accountPage.clickHomeButton(  data.firstName + " " + data.lastName);
            homePage.clickFirstProduct();

            productPage.addProductToCart();
            productPage.clickCartButton();
            cartPage.placeOrder();

            Assert.assertTrue(cartPage.getSuccessMessage().isDisplayed());



    }
}
