package WebElement_Verification_Method;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
																							
		//second line of code
	    driver.manage().window().maximize();
																												
		//navigate to instagram
		driver.get("https://www.instagram.com/");
		
		//locating the login button 
		WebElement loginElement = driver.findElement(By.xpath("//div[text()='submit']"));
		
		//verification that the element is enabled or not 
		System.out.println("is the element enabled ? " + loginElement.isEnabled());
          
		driver.quit();
	}

}
