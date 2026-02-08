package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver ;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[data-test=\"email\"]")
    private WebElement emailField;

    @FindBy(xpath = "//input[@data-test=\"password\"]")
    private WebElement passwordField;

    @FindBy(css = "input[data-test=\"login-submit\"]")
    private WebElement loginButton;

    public void login(String email,String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();

    }
}
