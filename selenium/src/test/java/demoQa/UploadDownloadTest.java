package demoQa;

import com.lucky.pages.demoQa.UploadDownloadPage;
import com.lucky.util.BaseTest;
import com.lucky.util.GetProjectPath;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;

public class UploadDownloadTest extends BaseTest {

    @Test
    public void uploadTest(){
        UploadDownloadPage uploadDownloadPage = new UploadDownloadPage(driver);
        driver.get("https://demoqa.com/upload-download");

      uploadDownloadPage.uploadFile();

        Assert.assertEquals(uploadDownloadPage.getUploadedFilePath().getText(),"C:\\fakepath\\picture.png");

    }

    @Test
    public void downloadTest() throws InterruptedException {
        UploadDownloadPage uploadDownloadPage = new UploadDownloadPage(driver);
        driver.get("https://demoqa.com/upload-download");

        uploadDownloadPage.downloadFile();
        Thread.sleep(5000);



            File file = new File(GetProjectPath.getProjectPath() + "\\src\\test\\resources\\sampleFile.jpeg");
            Assert.assertTrue(file.exists());



    }
}
