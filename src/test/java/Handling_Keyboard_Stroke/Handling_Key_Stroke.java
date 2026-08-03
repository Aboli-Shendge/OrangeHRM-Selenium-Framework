package Handling_Keyboard_Stroke;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Key_Stroke {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
																					
		//second line of code
		driver.manage().window().maximize();
												
		//navigate to flipkart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'x')]")).click();
		
		//locating the search field
		WebElement searchElement = driver.findElement(By.name("q"));
		
		//using keys class simulate enter key click
		searchElement.sendKeys("Computers",Keys.ENTER);
		
		//performing select all actions by keys class
		searchElement.sendKeys(Keys.LEFT_CONTROL+"c");
		//performing backspace action by keys class
		searchElement.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		//performing pasting action by keys class 
		searchElement.sendKeys(Keys.LEFT_CONTROL+"v");
		
		//performing backspace action 3 times by keys class
		searchElement.sendKeys(Keys.BACK_SPACE);
		searchElement.sendKeys(Keys.BACK_SPACE);
		searchElement.sendKeys(Keys.BACK_SPACE); 
		   
		//writing letter in uppercase by keys class  
		searchElement.sendKeys(Keys.LEFT_SHIFT,"applications");
	}

}
