package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Following_Sibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
											
		//second line of code
		driver.manage().window().maximize();
																
		//navigate to demowebshop
		driver.get("https://demowebshop.tricentis.com/");
				
		//locating the search field by following siblings
		driver.findElement(By.xpath("//div[@class = 'newsletter-email']/child::input[@name='NewsletterEmail']")).sendKeys("Mobiles");

	}

}
