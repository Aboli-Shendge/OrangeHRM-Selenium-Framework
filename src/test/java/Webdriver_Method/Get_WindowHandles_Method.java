package Webdriver_Method;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_WindowHandles_Method {

	public static void main(String[] args) {
		//first line of code
		WebDriver driver = new ChromeDriver();
		
		//second line of code 
		driver.manage().window().maximize();
		
		//navigate to demoWebshop
		driver.get("https://demowebshop.tricentis.co/");
		
		//perform some action
		driver.findElement(By.xpath("//li[@class ='facebook']/a")).click();
		
		//capture the session id of both the tabs 
		Set<String> handles = driver.getWindowHandles();
		System.out.println("all the session ID" + handles);
	}
}
