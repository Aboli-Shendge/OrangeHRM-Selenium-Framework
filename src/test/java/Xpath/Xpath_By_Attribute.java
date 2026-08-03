package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		// first line of code 
		WebDriver driver = new ChromeDriver();
						
		//second line of code
		driver.manage().window().maximize();
								
		//navigate to demowebshop
		driver.get(("https://demowebshop.tricentis.com/"));
		
		//locate the web element using xpath
		driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("laptops");
		
		Thread.sleep(3000);
		
		//locate the search button             
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
	}
}

