package Webdriver_Method.Manage_Method;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//first line of code
		WebDriver driver = new ChromeDriver();
				
		//capturing the position of window 
		System.out.println("initial position:"+driver.manage().window().getPosition());
		
		//set position of half of the window
		driver.manage().window().setPosition(new Point (750,500));
		Thread.sleep(1000);
		driver.manage().window().setPosition(new Point (360,200));
		Thread.sleep(1000);
		driver.manage().window().setPosition(new Point (900,500));
		Thread.sleep(1000);
		driver.manage().window().setPosition(new Point (720,600));
		Thread.sleep(1000);  

	}

}
