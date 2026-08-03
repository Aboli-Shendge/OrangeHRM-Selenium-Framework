package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Start_With {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
													
		//second line of code
		driver.manage().window().maximize();
																		
		//navigate to flipkart
    	driver.get("https://www.flipkart.com/");
    	Thread.sleep(8000);
    	
    	//locata nd click kitchen essentials using xpath by start -with
    	driver.findElement(By.xpath("//div[starts-with(text(),'kitch')]")).click();
  
    	Thread.sleep(2000);
    	driver.quit();

	}

}
