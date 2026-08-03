package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JS_Prompt_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//first line of code
		 WebDriver driver = new ChromeDriver();
				
		//second line of code
	   	driver.manage().window().maximize();
	   	
	   	//third line of code 
	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	   	
	    driver.get("https://demoqa.com/alerts");
	   	Actions actions = new Actions(driver);
	   	actions.scrollByAmount(0, 500).perform();
	    WebElement element = driver.findElement(By.id("promtButton"));
	   	Thread.sleep(2000);
	   	element.click();
	   	Thread.sleep(2000);
	    Alert alert = driver.switchTo().alert();
	   	Thread.sleep(2000);
	   	alert.sendKeys("Mobiles");
	   	alert.accept();
	}

}
