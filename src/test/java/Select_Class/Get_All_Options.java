package Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_All_Options {

	public static void main(String[] args) throws InterruptedException {
		// first line of code 
		WebDriver driver = new ChromeDriver();
																											
		//second line of code
		driver.manage().window().maximize();
																		
		//navigate to flipkart
		driver.get("https://demowebshop.tricentis.com/");
				
		//creating onj of select class
		Select select = new Select(driver.findElement(By.id("product_attribute_16_6_5")));
		
		Thread.sleep(3000);
		
		//capturing all the options from the select element
		List<WebElement> allOptions = select.getOptions();
		
		int i=1;
		//print all the options
		for(WebElement webElement : allOptions) {
		System.out.println("option"+ i +":"+ webElement.getText());
	    i++;
	}

  }
}