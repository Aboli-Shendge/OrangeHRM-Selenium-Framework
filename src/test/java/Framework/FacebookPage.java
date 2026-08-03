package Framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.FacebookLogin;

public class FacebookPage {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		
		   	driver.manage().window().maximize();
		   	
		   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		   	 
		   	driver.get("https://www.facebook.com/");
		   	
		   	//perfrm the action
		   	FacebookLogin log = new FacebookLogin(driver);
		   	
		   	//enter the email
		   	log.getUsernameElement().sendKeys("Qspiders");
		   
		   	log.getPasswordElement().sendKeys("Password");
		   	Thread.sleep(3000);
		   	log.getLoginElement().click();
	}

}
