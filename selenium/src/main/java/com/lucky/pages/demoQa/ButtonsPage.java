package com.lucky.pages.demoQa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage {

    WebDriver driver;

    public ButtonsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public WebElement getDoubleClickMessage() {
        return doubleClickMessage;
    }

    public WebElement getRightClickMessage() {
        return rightClickMessage;
    }

    public WebElement getDynamicCLickMessage() {
        return dynamicCLickMessage;
    }

    @FindBy(css ="button#doubleClickBtn")
    private WebElement doubleClickBtn;

    @FindBy(css ="button#rightClickBtn")
    private WebElement rightClickBtn;

    @FindBy(xpath = "//button[@id=\"rightClickBtn\"]//parent::div[@class=\"mt-4\"]//following-sibling::div//button")
    private WebElement dynamicButton;

    @FindBy(css = "p#doubleClickMessage")
    private WebElement doubleClickMessage;

    @FindBy(css ="p#rightClickMessage")
    private WebElement rightClickMessage;

    @FindBy(css = "p#dynamicClickMessage")
    private WebElement dynamicCLickMessage;




    public void clickButtons(){
        Actions actions = new Actions(driver);

        actions.doubleClick(doubleClickBtn).perform();
        actions.contextClick(rightClickBtn).perform();
        dynamicButton.click();

    }


}
