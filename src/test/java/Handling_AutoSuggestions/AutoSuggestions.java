package Handling_AutoSuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException { 
		// first line of code 
		WebDriver driver = new ChromeDriver();
																							
		//second line of code
		driver.manage().window().maximize();
														
		//navigate to flipkart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver .findElement(By.xpath("//button[text()='x']")).click();
		//locating the search flied and sending data
		driver.findElement(By.className("q")).sendKeys("mo");
		
		Thread.sleep(2000);
		
		//locating the monitor product and clicking it
		driver.findElement(By.xpath("//div[text()='nitor']")).click();
		
	}

}
