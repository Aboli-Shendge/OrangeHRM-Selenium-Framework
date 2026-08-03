package Action_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			
		//second line of code
		driver.manage().window().maximize();
																						
		//navigate to flipkart
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		WebElement src = driver.findElement(By.id("column-a"));
		WebElement target = driver.findElement(By.id("column-b"));
		
		//create a obj of action class
		Actions action = new Actions(driver);

		//performing drag and drop action
		action.dragAndDrop(src, target).perform();
	}

}
