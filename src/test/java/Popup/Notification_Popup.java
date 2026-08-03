package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Notification_Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(setting);
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.irctc.co.in/nget/train-search");

		
		
		  	}

}
   