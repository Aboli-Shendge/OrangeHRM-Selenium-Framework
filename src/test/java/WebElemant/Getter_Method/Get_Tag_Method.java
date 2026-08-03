package WebElemant.Getter_Method;

import org.openqa.selenium.By;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Tag_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
															
		//second line of code
		driver.manage().window().maximize();
																				
		//navigate to flipkart
	 	driver.get("https://www.actitime.com/");
	 	
	 	//locating the try for free button
	 	WebElement tryButtonElement = driver.findElement(By.linkText("Try actiTIME for Free"));
	 	
	 	//printing the tag name of the tryButtonElement
	 	System.out.println("Tag Name is : "+ tryButtonElement.getTagName());
	 	
	 	driver.quit();
	}

}
