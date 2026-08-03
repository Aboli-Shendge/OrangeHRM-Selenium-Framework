package Webdriver_Method.Manage_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition_Metrhod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first line of code
		WebDriver driver = new ChromeDriver();
		
		//capturing the position of window 
		System.out.println("initial position of the window"+driver.manage().window().getPosition());
		
		//capturing x and y co-ordinate 
		System.out.println("x co-ordinate : "+driver.manage().window().getPosition().getX());
		System.out.println("y co-ordinate : "+driver.manage().window().getPosition().getY());
		
  
		 
		
	}

}
