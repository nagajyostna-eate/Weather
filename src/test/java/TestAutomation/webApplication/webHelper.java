package TestAutomation.webApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webHelper {


    public static WebDriver launchWebDriver() {


        System.setProperty("webdriver.gecko.driver","C:\\Program Files\\gecko\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://weather-acceptance.herokuapp.com/");
        return driver;
    }
}
