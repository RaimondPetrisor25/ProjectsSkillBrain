package demoQa;

import com.lucky.pages.demoQa.ButtonsPage;
import com.lucky.util.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest  extends BaseTest {


@Test
    public void testButtons(){
    ButtonsPage buttonsPage = new ButtonsPage(driver);
     driver.get("https://demoqa.com/buttons");

    buttonsPage.clickButtons();

    Assert.assertEquals(buttonsPage.getDoubleClickMessage().getText(),
            "You have done a double click");
    Assert.assertEquals(buttonsPage.getRightClickMessage().getText(),
            "You have done a right click");
    Assert.assertEquals(buttonsPage.getDynamicCLickMessage().getText(),
            "You have done a dynamic click");

    }
}

