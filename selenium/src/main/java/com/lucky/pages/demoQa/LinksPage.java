package com.lucky.pages.demoQa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class LinksPage {

WebDriver driver;

public LinksPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver,this);
}

@FindBy(css ="a#simpleLink")
    private WebElement simpleLink;

@FindBy(css = "a#dynamicLink")
    private WebElement dynamicLink;

@FindBy(css = "a#created")
    private WebElement created;

@FindBy(css = "a#no-content")
private WebElement noContent;

@FindBy(css = "a#moved")
private WebElement moved;

@FindBy(css = "a#bad-request")
private WebElement badRequest;

@FindBy(css = "a#unauthorized")
private WebElement unauthorized;

@FindBy(css = "a#forbidden")
private WebElement forbidden;

@FindBy(css = "a#invalid-url")
private WebElement notFound;

@FindBy(css = "p#linkResponse")
private WebElement linkResponse;


public WebElement getLinkResponse() {
    return linkResponse;

}


public void clickSimpleLink(){
    simpleLink.click();

}

public void clickDynamicLink(){
    dynamicLink.click();

}
public void clickCreated(){
    created.click();

}
public void clickNoContent(){
    noContent.click();
    
    }
public void clickMoved(){
    moved.click();

}
public void clickBadRequest(){
    badRequest.click();

}
public void clickUnauthorized(){
    unauthorized.click();
}
public void clickForbidden(){
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView(true);",forbidden);
    forbidden.click();
}
public void clickNotFound(){
    notFound.click();

}
}
