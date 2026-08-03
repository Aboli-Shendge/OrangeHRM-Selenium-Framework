package WebElemant.Getter_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
																			
		//second line of code
		driver.manage().window().maximize();
																								
		//navigate to flipkart
		driver.get("https://www.flipkart.com/");
		
		//locate the cartbutton
		WebElement cartButtonElement = driver.findElement(By.xpath("//a[text()='cart']/.."));
		
		//capturing the rectangle object of cartbuttionElement 
		Rectangle rect = cartButtonElement.getRect();
		
		//printing the dimension and location of the cart button 
		System.out.println("Height of cart button:"+ rect.getHeight()+"\n"+"width of cart button :"+rect.getWidth());
		
		System.out.println("X co-ordinate of cart button:"+rect.getX()+"\n"+"Y co-ordinate of cart button:"+rect.getY());
		driver.quit();
		
		

	}

}
