package w3schools;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home
{
    //Variables
    WebDriver driver;
    private String url = "https://www.w3schools.com/html/html_tables.asp";

    //Constructor
    public Home(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    public static By getCountryNameForCompanyName(String companyName) {
        return By.xpath("//tr[contains(., '"+ companyName +"')]/td[3]");
    }

    //Keywords
    public Home navigate() {
        driver.navigate().to(url);
        BrowserActions.navigateToURL(driver, url);
        return this;
    }
}
