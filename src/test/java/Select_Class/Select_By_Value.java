package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_By_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// first line of code 
		WebDriver driver = new ChromeDriver();
																									
		//second line of code
		driver.manage().window().maximize();
																
		//navigate to flipkart
		driver.get("https://demowebshop.tricentis.com/");
		
		//creating onj of select class
		Select select2 = new Select(driver.findElement(By.id("product_attribute_16_6_5")));
		
		//select the option by value attribute
		select2.selectByValue("16");
	}

}
