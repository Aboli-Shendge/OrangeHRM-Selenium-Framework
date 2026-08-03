package Expressions;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Method {

	public static void main(String[] args) throws InterruptedException {
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
						
		//second line of code
		driver.manage().window().maximize();
								
		//navigate to flipkard
		driver.get(("https://www.flipkart.com"));
		
		//close login popup
		driver.findElement(By.xpath("//span[text()='x']v")).click();
		//locate the webelement based on cssselector locator
		driver.findElement(By.cssSelector("img[src*='mobiles.svg']")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
