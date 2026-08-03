package WebElemant.Getter_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Css_Property_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		// first line of code 
		WebDriver driver = new ChromeDriver();
															
		//second line of code
		driver.manage().window().maximize();
																				
		//navigate to flipkart
	 	driver.get("https://www.flipkart.com/");
	 	
	 	//locate the anvhor tag 
	 	WebElement aElement = driver.findElement(By.xpath("//a"));
	 	
	 	//capture the cssproperty aluign-items frome aElement
	 	String cssProperty = aElement.getCssValue("align-items");
	 	
	 	//print the value of css
	 	System.out.println("align=items :"+cssProperty);
	 	
	 	driver.quit();
	}

}
