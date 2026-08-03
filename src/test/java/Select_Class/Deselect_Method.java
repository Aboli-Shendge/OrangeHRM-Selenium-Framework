package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
     	WebDriver driver = new ChromeDriver();
				
		//second line of code
		driver.manage().window().maximize();
																		
		//navigate to demo web shop
		driver.navigate().to("https://demoqa.com/select-menu");
		
		//creating the object of select class
		Select select = new Select(driver.findElement(By.id("cars")));
		
		select.selectByVisibleText("Volvo");
		Thread.sleep(1000);
		System.out.println("is the dropdown is a multi-select:"+select.isMultiple());
		select.selectByVisibleText("Audi");
		Thread.sleep(1000);
		select.selectByVisibleText("saab");
		
		Thread.sleep(1000);
		
		//deselect the selected  option 
		select.deselectByIndex(0);
		Thread.sleep(1000);
		select.deselectByValue("audi");
		Thread.sleep(1000);
		select.deselectByVisibleText("saab");
		
		select.selectByVisibleText("Audi");
		select.deselectByValue("saab");
		Thread.sleep(1000);

		//deselect all option 
		select.deselectAll();

	}

}
