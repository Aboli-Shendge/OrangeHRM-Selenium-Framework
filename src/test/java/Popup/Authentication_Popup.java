package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first line of code
		 WebDriver driver = new ChromeDriver();
				
		//second line of code
	   	driver.manage().window().maximize();
	   	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	   	

	}

}
