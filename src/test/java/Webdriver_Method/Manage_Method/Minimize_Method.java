package Webdriver_Method.Manage_Method;

import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first line of code 
		WebDriver driver = new ChromeDriver();
		
		//navigate the google
		driver.get("https://www.google.com");
		
		//minimizing browser by 1 way
		Window handleWindow= driver.manage().window();
				
			handleWindow.minimize();
				
			handleWindow.maximize();
		//minimizing browser by 2 way 
		driver.manage().window().minimize();
	}

}
