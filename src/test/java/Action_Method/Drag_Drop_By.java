package Action_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_By {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			
		//second line of code
		driver.manage().window().maximize();
																							
		//navigate to flipkart
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
			
		WebElement src = driver.findElement(By.id("draggable"));
			
		//create a obj of action class
		Actions action = new Actions(driver);

		//performing drag and drop action
		action.dragAndDropBy(src, 100,421).perform();
		}
	}


