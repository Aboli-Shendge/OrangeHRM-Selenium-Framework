package Xpath;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Multiple_Attributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// first line of code 
		WebDriver driver = new ChromeDriver();
										
		//second line of code
		driver.manage().window().maximize();
												
		//navigate to demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		
		//located vote button using xpath by multiple attributes
		driver.findElement(By.xpath("//input[@type='button' and @class = "+ "'button-2 vote-poll-button']")).click();
		
	}

}
