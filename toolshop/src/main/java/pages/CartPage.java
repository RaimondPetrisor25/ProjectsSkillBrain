package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[data-test=\"proceed-1\"")
    private WebElement proceedButton1;

    @FindBy(css = "button[data-test=\"proceed-2\"")
    private WebElement proceedButton2;

    @FindBy(css="button[data-test=\"proceed-3\"")
    private WebElement proceedButton3;

    @FindBy(css= "select[data-test=\"payment-method\"]")
    private WebElement paymentMethodDropdown;

    @FindBy(css = "button[data-test=\"finish\"]")
    private WebElement finishButton;

    @FindBy(css = "div[data-test=\"payment-success-message\"]")
    private  WebElement successMessage;

    public void placeOrder() {
        proceedButton1.click();
        proceedButton2.click();
        proceedButton3.click();

        Select select = new Select(paymentMethodDropdown);
        select.selectByIndex(2);

        finishButton.click();

    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }
}
