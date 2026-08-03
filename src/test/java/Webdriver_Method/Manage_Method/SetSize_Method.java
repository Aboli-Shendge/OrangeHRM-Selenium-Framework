package Webdriver_Method.Manage_Method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize_Method {

	public static void main(String[] args) throws InterruptedException { 
		
		//first line of code 
		WebDriver driver = new ChromeDriver();
		
        //Approch 1
		//setting the size of window
		driver.manage().window().setSize(new Dimension(800,500));
		
		Thread.sleep(5000);
		
		//Approch 2
		//Object creation of dimension
		Dimension d = new Dimension(1500,800);
		//setting the size of window
		driver.manage().window().setSize(d);
	}

}
