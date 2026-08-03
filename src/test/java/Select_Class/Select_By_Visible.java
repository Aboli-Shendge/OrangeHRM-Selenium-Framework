package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_By_Visible {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//second line of code
		driver.manage().window().maximize();
																
		//navigate to flipkart
		driver.get("https://demowebshop.tricentis.com/");
		
		//creating onj of select class
        Select select2 = new Select(driver.findElement(By.id("product_attribute_16_6_5")));
				
     	//select the option by value attribute
		select2.selectByValue("16");
		
		//another obje for another select elementy 
		Select select3=new Select(driver.findElement(By.id("product_attribute_16_5_4")));
		
		Thread.sleep(3000);
		//select the option by the visible text
		select3.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");
		

	}

}
