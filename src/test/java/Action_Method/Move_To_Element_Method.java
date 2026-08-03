package Action_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_To_Element_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			
			//second line of code
			driver.manage().window().maximize();
																					
			//navigate to flipkart
			driver.get("https://www.amazon.in/");
			
			//locating web element
			WebElement accountsandList= driver.findElement(By.id("nav-link-accountList"));
			
			//create a obj of action class
			Actions action = new Actions(driver);

			//hovering to account nd list dropdown 
			action.moveToElement(accountsandList).perform();
			
			Thread.sleep(2000);
			
			//hovering to the ur acc link
			action.moveToElement(driver.findElement(By.xpath("//span[text()='Your Account']"))).click().perform();
		
	}

}
