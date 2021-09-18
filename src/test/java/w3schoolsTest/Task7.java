package w3schoolsTest;

import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import w3schools.Home;

public class Task7
{
    WebDriver driver;

    @Test
    public void countryName() {
        new Home(driver).navigate();

        Validations.assertThat()
                .element(driver, Home.getCountryNameForCompanyName("Ernst Handel"))
                .text()
                .isEqualTo("Austria")
                .withCustomReportMessage("Checking that the country name of company name 'Ernst Handel' is 'Austria'")
                .perform();
    }

    @BeforeClass
    public void beforeClass() {
        driver = DriverFactory.getDriver();
    }

    @AfterClass
    public void afterClass() {
        DriverFactory.closeAllDrivers();
    }
}
