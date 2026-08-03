package Webdriver_Method.Manage_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//first line of code 
		WebDriver driver = new ChromeDriver();
						
		//second line of code 
		driver.manage().window().maximize();
				
		Thread.sleep(3000);
		
		driver.get("https://demowebshop.tricentis.com/");
	}
}
