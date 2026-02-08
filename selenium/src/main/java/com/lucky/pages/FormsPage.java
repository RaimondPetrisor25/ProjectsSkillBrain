package com.lucky.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FormsPage {

    WebDriver driver;
    By hobbyCheckbox = By.cssSelector("label[for*=\"hobbies-checkbox\"]");
    @FindBy(css = "input[id=\"firstName\"]")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@id=\"lastName\"]")
    private WebElement lastNameField;
    @FindBy(css = "input#userEmail")
    private WebElement emailField;
    @FindBy(css = "label[for=\"gender-radio-1\"]")
    private WebElement genderRadioButton;
    @FindBy(xpath = "//input[@placeholder=\"Mobile Number\"]")
    private WebElement mobileNumberField;
    @FindBy(css = "textarea[id=\"currentAddress\"]")
    private WebElement currentAddressField;

    @FindBy(css = "div#state")
    private WebElement stateDropdown;

    @FindBy(css = "div#react-select-3-option-0")
    private WebElement stateDropdownOptions;





    public FormsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void fillForm() {

        JavascriptExecutor js =(JavascriptExecutor) driver;
        firstNameField.sendKeys("Raimond");
        lastNameField.sendKeys("Petrisor");
        emailField.sendKeys("test@test.com");
        js.executeScript("arguments[0].scrollIntoView(true);", genderRadioButton);
        genderRadioButton.click();
        mobileNumberField.sendKeys("1234567890");

        List<WebElement> hobbyList = driver.findElements(hobbyCheckbox);

        for (WebElement element : hobbyList) {
            element.click();
        }

        currentAddressField.sendKeys("Tomis283");
        js.executeScript("arguments[0].scrollIntoView(true);", stateDropdown);
        stateDropdown.click();
        stateDropdownOptions.click();
    }

    public void fillEmail() {
        emailField.sendKeys("email");

    }


}
