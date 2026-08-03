package Handling_Keyboard_Stroke;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// first line of code 
		WebDriver driver = new ChromeDriver();
																							
		//second line of code
		driver.manage().window().maximize();
														
		//navigate to flipkart
		driver.get("https://www.flipkart.com/");
						
		//locating the search field
	    WebElement searchElement = driver.findElement(By.name("q"));
	    //performing click operation to write in the field
	    searchElement.click();
	    
	    //using robot class type mob in the search field
	    Robot robot =new Robot();
	    
	    //simulating keypress operation on the 'm' key
	    robot.keyPress(KeyEvent.VK_M);
	    //SIMULATe keyrelease operation on the 'm' key 
	    robot.keyRelease(KeyEvent.VK_M);
	    Thread.sleep(2000);
	    
	    //simulating keypress operation on the 'O' key
	    robot.keyPress(KeyEvent.VK_O);
	    //SIMULATe keyrelease operation on the 'O' key 
	    robot.keyRelease(KeyEvent.VK_O);
	    Thread.sleep(2000);
	    
	    //simulating keypress operation on the 'B' key
	    robot.keyPress(KeyEvent.VK_B);
	    //SIMULATe keyrelease operation on the 'B' key 
	    robot.keyRelease(KeyEvent.VK_B);
	    Thread.sleep(2000);
	    
	    //Performing click operation on enter key
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	}

}
