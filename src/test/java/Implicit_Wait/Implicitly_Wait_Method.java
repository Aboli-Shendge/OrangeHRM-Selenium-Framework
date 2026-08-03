package Implicit_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitly_Wait_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//first line of code
		 WebDriver driver = new ChromeDriver();
			
		//second line of code
    	driver.manage().window().maximize();
    	
    	//third line of code 
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	
    	//Navigate to website
    	driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
				
    	driver.findElement(By.id("adder")).click();	
    	
    	System.out.println(driver.findElement(By.id("box0")).getCssValue("background-color"));
	}
}
