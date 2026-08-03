package DirectLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Method {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
		
		//second line of code
		driver.manage().window().maximize();
				
		//navigate to facebook
		driver.get(("https://demowebshop.tricentis.com/"));
				
		//locate the linktext
		driver.findElement(By.linkText("Register")).click();
	
	}

}
