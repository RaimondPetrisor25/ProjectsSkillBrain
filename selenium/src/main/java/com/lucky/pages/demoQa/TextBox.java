package com.lucky.pages.demoQa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBox {

    WebDriver driver;

    public TextBox(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input#userName")
    private WebElement  userNameField;

@FindBy(css = "input[placeholder=\"name@example.com\"]")
    private WebElement emailField;

@FindBy(xpath = "//textarea[@id=\"currentAddress\"]")
    private WebElement currentAddressField;

@FindBy(xpath = "//textarea[@id=\"permanentAddress\"]")
    private WebElement permanentAddressField;

@FindBy(xpath = "//button[contains(text(), \"Submit\")]")
    private WebElement submitButton;

@FindBy(css = "p#name")
    private WebElement showNameField;

@FindBy(css = "p#email")
    private WebElement showEmailField;

@FindBy(css = "p#currentAddress")
    private WebElement showCurrentAddressField;

@FindBy(css = "p#permanentAddress")
    private WebElement showPermanentAddressField;

public void fillForm(String userName, String email,String currentAddress,String permanentAddress) {
    userNameField.sendKeys(userName);
    emailField.sendKeys(email);
    currentAddressField.sendKeys(currentAddress);
    permanentAddressField.sendKeys(permanentAddress);
    submitButton.click();
}

    public WebElement getShowNameField() {
        return showNameField;
    }

    public WebElement getShowEmailField() {
        return showEmailField;
    }

    public WebElement getShowCurrentAddressField() {
        return showCurrentAddressField;
    }

    public WebElement getShowPermanentAddressField() {
        return showPermanentAddressField;
    }
}


