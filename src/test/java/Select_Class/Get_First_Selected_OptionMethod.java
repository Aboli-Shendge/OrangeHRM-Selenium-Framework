package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_First_Selected_OptionMethod {
	public static void main(String[] args) throws InterruptedException {
		
     	WebDriver driver = new ChromeDriver();
				
		//second line of code
		driver.manage().window().maximize();
																		
		//navigate to demo web shop
		driver.navigate().to("https://demoqa.com/select-menu");
		
		//creating the object of select class
		Select select = new Select(driver.findElement(By.id("cars")));
		
		select.selectByVisibleText("Audi");
		select.selectByValue("saab");
		Thread.sleep(3000);
		
		//capture the first selected option
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println("First selected option :"+firstSelectedOption.getText());
		 
		select.deselectAll();
 	}
}
