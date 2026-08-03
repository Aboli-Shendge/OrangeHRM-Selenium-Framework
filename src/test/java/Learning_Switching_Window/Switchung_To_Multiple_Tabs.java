package Learning_Switching_Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchung_To_Multiple_Tabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// first line of code 
		WebDriver driver = new ChromeDriver();
																													
		//second line of code
		driver.manage().window().maximize();
																				
		//navigate to flipkart
		driver.get("https://demowebshop.tricentis.com/");
		
		// Click on Facebook link
		driver.findElement(By.linkText("Facebook")).click();

		// Click on Twitter link
		driver.findElement(By.linkText("Twitter")).click();

		// Click on Google+ link
		driver.findElement(By.linkText("Google+")).click();
		
		//capturing all the handles
		 Set<String> allSessionID = driver.getWindowHandles();
		 for (String currentSessionId : allSessionID) {
			  driver.switchTo().window(currentSessionId);
			  Thread.sleep(1000);
			  
		//switching to google+ by verification
		  if (driver.getPageSource().contains("this blog outlines upcoming")) {
			  
		  }
			    driver.findElement(By.name("q")).sendKeys("QSpiders");
			}
	}

}
