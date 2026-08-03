package Action_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_To_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			
		//second line of code
		driver.manage().window().maximize();
																						
		//navigate to flipkart
		driver.get("https://demowebshop.tricentis.com/");
			
		//create a obj of action class
		Actions action = new Actions(driver);

		action.scrollToElement(driver.findElement(By.linkText("Facebook"))).perform();
				
	}

}
