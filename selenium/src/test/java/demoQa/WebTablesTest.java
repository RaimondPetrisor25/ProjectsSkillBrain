package demoQa;

import com.github.javafaker.Faker;
import com.lucky.pages.demoQa.WebTables;
import com.lucky.util.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest {

    Faker faker = new Faker();

    @Test
    public void addNewEmployee (){
        WebTables webTables = new WebTables(driver);
        driver.get("https://demoQa.com/webtables");

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.name().firstName() + "@mail.com";
        String age = String.valueOf(faker.number().numberBetween(18,64));
        String salary = String.valueOf(faker.number().numberBetween(3000, 10000));
        String department = faker.company().profession();

        webTables.addNewEmployee(firstName, lastName , email , age , salary , department);
    String[] cellsValues = webTables.getCellValue();

        Assert.assertEquals(cellsValues[0], firstName);
        Assert.assertEquals(cellsValues[1], lastName);
        Assert.assertEquals(cellsValues[2], age);
        Assert.assertEquals(cellsValues[3], email);
        Assert.assertEquals(cellsValues[4], salary);
        Assert.assertEquals(cellsValues[5], department);

    }

}
