package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerRegistrationPage {

    WebDriver driver;

    public CustomerRegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[data-test=\"first-name\"]")
    private WebElement firstNameField;

    @FindBy(css = "input[data-test=\"last-name\"]")
    private WebElement lastNameField;

    @FindBy(css = "input[data-test=\"dob\"]")
    private WebElement dateOfBirthField;

    @FindBy(css = "input[data-test=\"street\"]")
    private WebElement streetField;

    @FindBy(css = "input[data-test=\"postal_code\"]")
    private WebElement postalCodeField;

    @FindBy(css = "input[data-test=\"city\"]")
    private WebElement cityField;

    @FindBy(css = "input[data-test=\"state\"]")
    private WebElement stateField;

    @FindBy(css = "select[data-test=\"country\"]")
    private WebElement countryField;

    @FindBy(css = "input[data-test=\"phone\"]")
    private WebElement phoneField;

    @FindBy(css = "input[data-test=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "input[data-test=\"password\"]")
    private WebElement passwordField;

    @FindBy(css = "button[data-test=\"register-submit\"]")
    private WebElement registerButton;

    public void fillUserinfo(String firtName,String lastName,String dateOfBirth) {
        firstNameField.sendKeys(firtName);
        lastNameField.sendKeys(lastName);
        dateOfBirthField.sendKeys(dateOfBirth);
    }
public void fillUserAddress(String street,String postalCOde,String city,String state,String country,String phone){
        streetField.sendKeys(street);
        postalCodeField.sendKeys(postalCOde);
        cityField.sendKeys(city);
        stateField.sendKeys(state);
        countryField.sendKeys(country);
        phoneField.sendKeys(phone);

}
public void fillUserCredentials(String email,String password){
        emailField.sendKeys(email);
        passwordField.sendKeys(password);

}
public void clickRegisterButton(){
        registerButton.click();
}

}

