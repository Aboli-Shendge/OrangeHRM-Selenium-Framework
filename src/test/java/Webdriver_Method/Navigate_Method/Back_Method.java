package Webdriver_Method.Navigate_Method;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Back_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//first line of code 
		WebDriver driver = new ChromeDriver();
		
		//navigate to facebook
		driver.navigate().to("https://www.facabook.com");
		
		//navigate to google
	    driver.navigate().to("https://www.google.com");
	  
	    //navigate to demowebshop
	  	driver.get("https://demowebshop.tricentis.com");
	  		
	  	//navigate back to google
	  	driver.navigate().back();
	  	
	   //navigate back to facebook
	   driver.navigate().back();
	}

}
