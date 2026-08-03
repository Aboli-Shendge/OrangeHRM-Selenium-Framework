package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_PrecedingSibling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
										
		//second line of code
		driver.manage().window().maximize();
														
		//navigate to demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		//locating the search field by xpath by axes
		driver.findElement(By.xpath("//input[@value = 'Search']/preceding-sibling::input")).sendKeys("Mobiles");
		Thread.sleep(2000);
	}

}
