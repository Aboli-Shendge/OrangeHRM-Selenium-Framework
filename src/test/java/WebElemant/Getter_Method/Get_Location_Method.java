package WebElemant.Getter_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
																			
		//second line of code
		driver.manage().window().maximize();
																								
		//navigate to flipkart
		driver.get("https://www.flipkart.com/");
		
		//locate the anchor element and capture the location
		Point locationOfElement = driver.findElement(By.xpath("//a")).getLocation();
		
		System.out.println("x co-ordinate : " + locationOfElement.getX());
		System.out.println("y co-ordinate : " + locationOfElement.getY());
		driver.quit();

	}

}
