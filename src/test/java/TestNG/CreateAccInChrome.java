package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CreateAccInChrome {
@Test
	public void createAccount() {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().setPosition(new Point(0,0));
	    driver.get("https://www.facebook.com");
		Reporter.log("Account is created in chrome",true);
	}
}
