package WebElement_Methods;

import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Actions_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
															
		//second line of code
		driver.manage().window().maximize();
																				
		//navigate to flipkart
	 	driver.get("https://www.flipkart.com/");
	 	 
	 	//login page exeucation 
	 	//locating the email field
	 	WebElement emailElement = driver.findElement(By.id("email"));
	 	//locating the pass field
	 	WebElement passwordElement = driver.findElement(By.id("pass"));
	 	 
	 	//locate the login button using relativelocator
	 	WebElement loginElement = driver.findElement(RelativeLocator.with(By.tagName("button")).above(By.linkText("Forgotten password?")));
	 	
	 	//sedkeys in email
	 	emailElement.sendKeys("dhgdwfd");
	 	Thread.sleep(2000);
	 	//seding keys  inside  pass
	 	emailElement.sendKeys("mbhjg");
	 	
	 	//clearing the email nd password field
	 	emailElement .clear();
	 	Thread.sleep(2000);
	 	passwordElement.clear();
	 	
		//sedkeys in email
	 	emailElement.sendKeys("Qspiders");
	 	Thread.sleep(2000);
	 	//seding keys  inside  pass
	 	emailElement.sendKeys("password");
	 	
	 	//click the login button
	 	loginElement.click();
	 	Thread.sleep(2000);
	 	driver.quit();
	 	

	}

}
