 package Webdriver_Method.Manage_Method;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fullscrenn_Method {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first line of code 
		WebDriver driver = new ChromeDriver();
		
		//navigate the facebook
		driver.get("https://www.facebook.com");
		
		//fullscreen mode
		driver.manage().window().fullscreen();
	}

}
