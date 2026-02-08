package com.lucky.pages.demoQa;

import com.lucky.util.GetProjectPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadDownloadPage {

    WebDriver driver;

    public UploadDownloadPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input#uploadFile")
    private WebElement uploadFile;

    @FindBy(css = "a#downloadButton")
    private WebElement downloadButton;

    @FindBy(css = "p#uploadedFilePath")
    private WebElement uploadedFilePath;



public void uploadFile(){
    String filePath = GetProjectPath.getProjectPath() + "\\src\\test\\resources\\picture.png";
    System.out.println(filePath);
    uploadFile.sendKeys(filePath);

}
public WebElement getUploadedFilePath() {
    return  uploadedFilePath;
}
public void downloadFile(){
    downloadButton.click();
}

}
