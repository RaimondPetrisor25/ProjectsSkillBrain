package demoQa;

import com.lucky.pages.demoQa.TextBox;
import com.lucky.util.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @Test
    public void textBoxTest() {
        TextBox textBox = new TextBox(driver);

        driver.get("https://demoqa.com/text-box");
        textBox.fillForm("Petrisor Raimond", "email@email.com", "Tomis283", "Techirghiol");
        Assert.assertEquals(textBox.getShowNameField().getText(), "Name:Petrisor Raimond");
        Assert.assertEquals(textBox.getShowEmailField().getText(),"Email:email@email.com");
        Assert.assertEquals(textBox.getShowCurrentAddressField().getText(),"Current Address :Tomis283");
        Assert.assertEquals(textBox.getShowPermanentAddressField().getText(),"Permananet Address :Techirghiol");

    }








}
