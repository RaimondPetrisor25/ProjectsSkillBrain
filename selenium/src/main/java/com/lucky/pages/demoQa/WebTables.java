package com.lucky.pages.demoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTables {

    WebDriver driver;

    public WebTables(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver , this);

    }

    @FindBy(css = "button#addNewRecordButton")
    private WebElement addNewRecordButton;

    @FindBy(css = "input#firstName")
    private WebElement firstNameField;

    @FindBy (css = "input#lastName")
    private WebElement lastNameField;

    @FindBy (css ="input#userEmail" )
    private WebElement userEmailField;

    @FindBy(css = "input#age")
    private WebElement ageField;

    @FindBy(css = "input#salary")
    private WebElement salaryField;

    @FindBy(css = "input#department")
    private WebElement departmentField;

    @FindBy(css ="button#submit")
    private WebElement submitButton;

    By webTableCells = By.xpath("(//div[@class=\"rt-tr-group\"])[4]/div[@role=\"row\"]/div[@role=\"gridcell\"]");

    public void addNewEmployee(String firstName, String lastName, String userEmail, String age, String salary, String department) {
        addNewRecordButton.click();

        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        userEmailField.sendKeys(userEmail);
        ageField.sendKeys(age);
        salaryField.sendKeys(salary);
        departmentField.sendKeys(department);

        submitButton.click();
    }

    public String[] getCellValue() {
        List<WebElement> cells = driver.findElements(webTableCells);
        String[] cellValues = new String[6];


        for (int i = 0; i < cells.size()-1; i++){
            cellValues[i] = cells.get(i).getText();
        }
        return cellValues;

    }

}
