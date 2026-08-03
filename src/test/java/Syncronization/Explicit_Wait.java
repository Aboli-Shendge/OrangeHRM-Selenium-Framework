package Syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//first line of code
	 WebDriver driver = new ChromeDriver();
			
	//second line of code
   	driver.manage().window().maximize();
   	
   	//third line of code 
   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
   	
   	//Navigate to website
   	driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
				
   	WebElement inputELement= driver.findElement(By.id("revealed"));
   	
   	//create obj
   	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
   	
   	//checking the visibility of element
   	wait.until(ExpectedConditions.visibilityOf(inputELement));
   	
   	inputELement.sendKeys("Click");
   	
   			
	}

}
