package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Contains {

	public static void main(String[] args) {
	
		// first line of code 
		WebDriver driver = new ChromeDriver();
								
		//second line of code
		driver.manage().window().maximize();
										
		//navigate to demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		
		//locate the log in link using xpath by contains and attribute and click it
		driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
		
		//locate the web element using xpath by contains and text()
		WebElement textElement = driver.findElement(By.xpath("//div[contains(text(),'By creating a')]"));
		
		//print the text or content of the web element
		System.out.println("content of the web element : "+textElement.getText());
	}
}   