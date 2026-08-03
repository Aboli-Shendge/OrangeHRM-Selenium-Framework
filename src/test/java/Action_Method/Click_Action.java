package Action_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//second line of code
		driver.manage().window().maximize();
																				
		//navigate to flipkart
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searchElement = driver.findElement(By.xpath("//input[@value='Search']"));
		
		//create a obj of action class
		Actions action = new Actions(driver);
		
		action.click(searchElement).build().perform();
	}
}