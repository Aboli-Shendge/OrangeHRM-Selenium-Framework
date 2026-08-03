package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Thread_Pool_Size {
	@Test(threadPoolSize = 2 ,invocationCount = 10 )
	public void createAccount() {
		WebDriver driver = new ChromeDriver();
		
		Reporter.log("Account is created",true);
	}
	

}
