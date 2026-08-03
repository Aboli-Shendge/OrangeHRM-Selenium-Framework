package Action_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    WebDriver driver = new ChromeDriver();
		
		//second line of code
		driver.manage().window().maximize();
																				
		//navigate to flipkart
		driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
		
		WebElement element = driver.findElement(By.id("ondoubleclick"));
		
		//create a obj of action class
		Actions action = new Actions(driver);
		
		action.doubleClick(element).build().perform();
	}

}
