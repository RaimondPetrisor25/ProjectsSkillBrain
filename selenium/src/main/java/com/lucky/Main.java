package com.lucky;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


       WebDriver driver = new ChromeDriver();

       driver.manage().window().setSize(new Dimension(1920 , 1080 ));
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));




       driver.get("https://demoqa.com/automation-practice-form");

       driver.findElement(By.cssSelector("input[id=\"firstName\"]")).sendKeys("Raimond");

       driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Petrisor");

       driver.findElement(By.cssSelector("input#userEmail")).sendKeys( "mail@example.com");
        WebElement label = driver.findElement(By.cssSelector("label[for=\"gender-radio-1\"]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);" , label);


       driver.findElement(By.cssSelector("label[for=\"gender-radio-1\"]")).click();

       driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]")).sendKeys("1234567890");

        List<WebElement> hobby = driver.findElements(By.cssSelector("label[for*=\"hobbies-checkbox\"]"));
        driver.findElement(By.cssSelector("textarea[id=\"currentAddress\"]")).sendKeys("Tomis283");




        for(WebElement element : hobby){
            element.click();


            driver.findElement(By.cssSelector("div#state")).click();
            driver.findElement(By.cssSelector("div#react-select-3-option-0")).click();
        }



      // driver.quit();





    }
}