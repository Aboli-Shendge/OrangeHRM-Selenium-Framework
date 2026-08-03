package Webdriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_WindowHandle_Method {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first line of code
		WebDriver driver = new ChromeDriver();
		
		//capturing the session id
		String windowHandle = driver.getWindowHandle();
		
		//print
		System.out.println("session ID of the current window : "+ windowHandle);
				

	}

}
