package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_Upload_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//first line of code
		 WebDriver driver = new ChromeDriver();
				
		//second line of code
	   	driver.manage().window().maximize();
	   	
	   	//third line of code 
	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	   	
	   	driver.get("https://www.naukri.com/");
	    driver.findElement(By.id("register_Layer")).click();
	   	Actions actions = new Actions(driver);
	   	actions.scrollByAmount(0, 500).perform();
	    driver.findElement(By.xpath("//div[@data-val='exp']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\shend\\Downloads\\Day_31_32_BasicSelenium.pdf");
	}

}
