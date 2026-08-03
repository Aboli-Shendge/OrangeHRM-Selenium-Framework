package Action_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_To_OfSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			
		//second line of code
		driver.manage().window().maximize();
																					
		//navigate to flipkart
		driver.get("https://demowebshop.tricentis.com/");
		
		//create a obj of action class
		Actions action = new Actions(driver);

		//move hover to element by co -ordinates
		action.moveByOffset(454,197).perform();
			
	}

}
