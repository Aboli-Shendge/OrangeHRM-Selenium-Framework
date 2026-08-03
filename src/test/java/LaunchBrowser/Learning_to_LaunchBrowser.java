package LaunchBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_to_LaunchBrowser {
    public static void main(String[] args) {
        // First line: setup driver
        WebDriverManager.chromedriver().setup();

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Print title in console
        System.out.println("Page title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}