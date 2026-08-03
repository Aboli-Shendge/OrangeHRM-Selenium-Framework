package DirectLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locators {

	public static void main(String[] args)  throws InterruptedException {
			
		// first line of code 
		WebDriver driver = new ChromeDriver();
		
		//second line of code
		driver.manage().window().maximize();
		
		//navigate to facebook
		driver.get(("https://www.facebook.com"));
		
		//locate email textfield and enter email
		driver.findElement(By.id("_R_1h6kqsqppb6amH1_")).sendKeys("qspiders.com");
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
