package com.lucky.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {


    public static String takeScreenshoot(WebDriver driver, String methodName) {
        TakesScreenshot ts = (TakesScreenshot) driver;

        File src = ts.getScreenshotAs(OutputType.FILE);
        String timeStamp = new SimpleDateFormat("HHmmss.SSS").format(new Date());
        String screenshotPath = "report/screenshots/" + methodName + "_" + timeStamp + ".png";
        String reportPicturePath = "screenshots/" + methodName + "_" + timeStamp + ".png";

        File destination = new File(screenshotPath);

        if(!destination.getParentFile().exists()) {
            destination.getParentFile().mkdir();
        }

        try {
            Files.copy(src.toPath(), destination.toPath());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return reportPicturePath;

    }
}





