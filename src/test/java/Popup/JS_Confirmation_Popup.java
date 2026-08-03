package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Confirmation_Popup {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		//first line of code
		 WebDriver driver = new ChromeDriver();
				
		//second line of code
	   	driver.manage().window().maximize();
	   	
	   	//third line of code 
	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	   	
	   	driver.get("https://demo.guru99.com/test/delete_customer.php");
	   	WebElement searchElement = driver.findElement(By.name("cusid"));
	   	WebElement submitElement = driver.findElement(By.name("sumit"));
	   	searchElement.sendKeys("Mobile");
	   	submitElement.click();
	   	Thread.sleep(2000);
	  //capturing obj of type alert
	   	Alert alert =driver.switchTo().alert();
	   	//clicking on ok
	   	alert.accept();
		Thread.sleep(2000);
		alert.accept();
		//to avoid stale element exception
		searchElement = driver.findElement(By.name("cusid"));
		submitElement = driver.findElement(By.name("sumit"));
		searchElement.sendKeys("Mobile");
		submitElement.click();
		alert.dismiss();
	}

}
