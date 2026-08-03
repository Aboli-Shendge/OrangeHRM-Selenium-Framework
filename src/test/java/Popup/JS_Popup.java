package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//first line of code
		 WebDriver driver = new ChromeDriver();
				
		//second line of code
	   	driver.manage().window().maximize();
	   	
	   	//third line of code 
	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   	
	   	//Navigate to website
	    driver.get("https://demowebshop.tricentis.com/");
	    
	    driver.findElement(By.id("//input[@type='submit']")).click();
	    
	    Thread.sleep(2000);
	    
	    //handle to popup
	    driver.switchTo().alert().accept();
	}

}
