package Webdriver_Method;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title_Method {

	public static void main(String[] args) {

		//first line of code;
		WebDriver driver = new ChromeDriver();
		
		//capturing the title of facebook url;
		driver.get("https//www.facebook.com");
		
		String title = driver.getTitle();
		
		System.out.println("Title:"+title);
		
	}

  }
