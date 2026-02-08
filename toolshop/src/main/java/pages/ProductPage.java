package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button#btn-add-to-cart")
    private WebElement addToCartButton;

    @FindBy(css = "a[data-test=\"nav-cart\"]")
    private WebElement cartButton;

    @FindBy(css = "div[role=\"alert\"]")
    private WebElement cartAlert;

    public void addProductToCart(){
        addToCartButton.click();
    }

    public void clickCartButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(cartAlert));
        cartButton.click();

    }
}
