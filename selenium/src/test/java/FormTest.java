import com.lucky.pages.FormsPage;
import com.lucky.util.BaseTest;
import org.testng.annotations.Test;

public class FormTest extends BaseTest {


    @Test
    public void formTest(){
        FormsPage formsPage = new FormsPage(driver);
        driver.get("https://demoqa.com/automation-practice-form");
        formsPage.fillForm();
    }


}
