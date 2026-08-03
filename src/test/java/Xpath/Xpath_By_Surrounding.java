package Xpath;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Surrounding {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
												
		//second line of code
		driver.manage().window().maximize();
														
		//navigate to makemytrip
		driver.get("https://www.makemytrip.com/");
		
		//closing the popup message
		Thread.sleep(8000);
		
		driver.findElement(By.cssSelector("span[data-cy='closeModal']")).click();
		
		Thread.sleep(2000);
		
		//locating the date select button
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		Thread.sleep(2000);
		
		//locating the date element using xpath by surrounding
		driver.findElement(By.xpath("//div[text()='september 2025']/../../..//p[text()='26']")).click();
		
	}
}
