package Utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;
    public static ConfigReader config = new ConfigReader();

    public static void launchBrowser() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WaitUtils.initializeWait(driver);

        driver.get(config.getUrl());
    }

    public static void closeBrowser() {

        if (driver != null) {
            driver.quit();
        }
    }
}