package WebElement_Verification_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
																					
		//second line of code
		driver.manage().window().maximize();
																										
		//navigate to demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		
		//locating the web element 
		WebElement element =driver.findElement(By.xpath("//a[contains(text(),'Desktops')]"));
		
		//verification of the element is displayed or not 
		System.out.println("is displayed ? "+ element.isDisplayed());
		
		driver.quit();
		

	}

}
