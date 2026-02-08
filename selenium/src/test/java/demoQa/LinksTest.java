package demoQa;

import com.lucky.pages.demoQa.LinksPage;
import com.lucky.util.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class LinksTest extends BaseTest {

    @Test
    public void simpleLinkTest(){
        LinksPage linksPage= new LinksPage(driver);
        driver.get("https://demoqa.com/links");

        linksPage.clickSimpleLink();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));

        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/");
    }
    @Test
    public void dynamicLinkTest() {
        LinksPage linksPage = new LinksPage(driver);
        driver.get("https://demoqa.com/links");
        linksPage.clickDynamicLink();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }
    @Test
    public void createdLinkTest() {
        LinksPage linksPage = new LinksPage(driver);
        driver.get("https://demoqa.com/links");

        linksPage.clickCreated();
        Assert.assertEquals(linksPage.getLinkResponse().getText(), "Link has responded with staus 201 and status text Created");
    }

    @Test
    public void clickLinksTest(){
    LinksPage linksPage = new LinksPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    driver.get("https://demoqa.com/links");

    linksPage.clickNoContent();
    wait.until(ExpectedConditions.textToBe(By.cssSelector("p#linkResponse"),"Link has responded with staus 204 and status text No Content"));
    Assert.assertEquals(linksPage.getLinkResponse().getText(),"Link has responded with staus 204 and status text No Content");

    linksPage.clickMoved();
        wait.until(ExpectedConditions.textToBe(By.cssSelector("p#linkResponse"),"Link has responded with staus 301 and status text Moved Permanently"));
    Assert.assertEquals(linksPage.getLinkResponse().getText(),"Link has responded with staus 301 and status text Moved Permanently");

    linksPage.clickBadRequest();
        wait.until(ExpectedConditions.textToBe(By.cssSelector("p#linkResponse"),"Link has responded with staus 400 and status text Bad Request"));
    Assert.assertEquals(linksPage.getLinkResponse().getText(),"Link has responded with staus 400 and status text Bad Request");

    linksPage.clickUnauthorized();
        wait.until(ExpectedConditions.textToBe(By.cssSelector("p#linkResponse"),"Link has responded with staus 401 and status text Unauthorized"));
    Assert.assertEquals(linksPage.getLinkResponse().getText(),"Link has responded with staus 401 and status text Unauthorized");

    linksPage.clickForbidden();
        wait.until(ExpectedConditions.textToBe(By.cssSelector("p#linkResponse"),"Link has responded with staus 403 and status text Forbidden"));
    Assert.assertEquals(linksPage.getLinkResponse().getText(),"Link has responded with staus 403 and status text Forbidden");

    linksPage.clickNotFound();
        wait.until(ExpectedConditions.textToBe(By.cssSelector("p#linkResponse"),"Link has responded with staus 404 and status text Not Found"));
    Assert.assertEquals(linksPage.getLinkResponse().getText(),"Link has responded with staus 404 and status text Not Found");
    }
}
