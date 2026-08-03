package OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

    public static void main(String[] args) throws InterruptedException {

        // Launch Browser
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();

        // Open Application
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Login
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")))
                .sendKeys("Admin");

        driver.findElement(By.name("password"))
                .sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();

        // Verify Dashboard Heading
        WebElement dashboard = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//h6[text()='Dashboard']")));

        if (dashboard.isDisplayed()) {
            System.out.println("Dashboard is displayed");
        } else {
            System.out.println("Dashboard is not displayed");
        }

        // Verify Login using URL
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains("dashboard")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        // Click Profile Icon
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[@class='oxd-userdropdown-tab']")))
                .click();

        // Click Logout
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[text()='Logout']")))
                .click();

        // Verify Logout using URL
        wait.until(ExpectedConditions.urlContains("login"));

        String logoutUrl = driver.getCurrentUrl();

        if (logoutUrl.contains("login")) {
            System.out.println("Logout Successful");
        } else {
            System.out.println("Logout Failed");
        }

        Thread.sleep(2000);
        driver.quit();
    }
} 