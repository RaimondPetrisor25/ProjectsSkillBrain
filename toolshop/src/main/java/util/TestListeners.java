package util;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

    @Override
    public void onStart(ITestContext context){
        ExtentManager.createInstance();

    }

    @Override
    public void onTestStart(ITestResult result){
        ExtentManager.startTest(result.getMethod().getMethodName());

    }
    @Override
    public void onTestSuccess(ITestResult result){
        ExtentManager.getTest().log(Status.PASS, "Test Passed");

    }
    @Override
    public void onTestFailure(ITestResult result){
        ExtentManager.getTest().log(Status.FAIL, result.getThrowable());

        result.getInstance();
        WebDriver driver = BaseTest.driver;

        String screenshotPath = ScreenshotUtil.takeScreenshoot(driver, result.getMethod().getMethodName());
        ExtentManager.getTest().addScreenCaptureFromPath(screenshotPath);


    }
    @Override
    public void onTestSkipped(ITestResult result){
        ExtentManager.getTest().log(Status.SKIP, "Test Skipped");

    }
    @Override
    public void onFinish(ITestContext context){
        ExtentManager.endReport();
    }
}
