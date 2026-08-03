package Action_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_And_Hold {

	public static void main(String[] args) throws InterruptedException {
		
	    WebDriver driver = new ChromeDriver();
			
		//second line of code
		driver.manage().window().maximize();
																					
		//navigate to flipkart
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		
		driver.findElement(By.id("password")).sendKeys("Aboli@123");
		Thread.sleep(2000);
		
		WebElement hiddenElement = driver.findElement(By.xpath("//button[@tabindex = '0']"));
		
		//create a obj of action class
		Actions action = new Actions(driver);

		action.clickAndHold(hiddenElement).perform();
		Thread.sleep(2000);
		action.release(). perform();
				
			

	}

}
