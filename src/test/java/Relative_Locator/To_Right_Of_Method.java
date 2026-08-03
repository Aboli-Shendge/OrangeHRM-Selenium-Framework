package Relative_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class To_Right_Of_Method {

	public static void main(String[] args) {
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
													
		//second line of code
		driver.manage().window().maximize();
																		
		//navigate to demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		
		//locating the ref element
		WebElement refElement = driver.findElement(By.linkText("Register"));
		
		//locate the login link using relative locator
		driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(refElement)).click();


	}

}
