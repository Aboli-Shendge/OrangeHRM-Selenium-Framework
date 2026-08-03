package DirectLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Method {

	public static void main(String[] args) throws InterruptedException{
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
		
		//second line of code
		driver.manage().window().maximize();
				
		//navigate to facebook
		driver.get(("https://www.facebook.com"));
				
		//locate email textfield and enter password
		driver.findElement(By.name("pass")).sendKeys("password");
				
		Thread.sleep(3000);
				
		driver.quit();

	}

}
