package Webdriver_Method.Navigate_Method;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh_Method {

	public static void main(String[] args)throws InterruptedException { 
		
		//first line of code 
		WebDriver driver = new ChromeDriver();
				
		//navigate to facebook
		driver.navigate().to("https://www.facabook.com");
		
		Thread.sleep(3000);
				
		 //refresh the page
		 driver.navigate().refresh();
			}

		}
