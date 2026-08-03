package Xpath;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Text {

	public static void main(String[] args) {
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
						
		//second line of code
		driver.manage().window().maximize();
								
		//navigate to demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		
		//locate the web element using xpath
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	}

}
                                                 
