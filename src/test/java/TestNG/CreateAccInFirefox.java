package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CreateAccInFirefox {
	@Test
	public void createAccount() {
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().setPosition(new Point(500,500));
	    driver.get("https://www.google.com");
		Reporter.log("Account is created in firefox",true);
	}
}
