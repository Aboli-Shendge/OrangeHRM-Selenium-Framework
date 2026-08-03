package WebElement_Verification_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
																							
		//second line of code
		driver.manage().window().maximize();
																												
		//navigate to demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		
		//locating the radio button 
		WebElement radioElement = driver.findElement(By.id("pollanswers-1"));
		
		System.out.println("is the radio button selected:"+ radioElement.isSelected());
		
		radioElement.click();
		
		System.out.println("is IT after clicking:"+ radioElement.isSelected());
		Thread.sleep(3000);
		driver.quit();
	}

}
