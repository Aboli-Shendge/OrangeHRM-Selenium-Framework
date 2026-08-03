package Webdriver_Method.Navigate_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_url_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first line of code 
		WebDriver driver=new ChromeDriver();
				
	    //navigate to facebook by method chaining 
		driver.navigate().to("https://facebook.com");
		
		//capturing the object 
		Navigation navigate=driver.navigate();
		
		//navigate to google 
		navigate.to("https://www.google.com");	

	}

}
