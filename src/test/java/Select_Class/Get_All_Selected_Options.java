package Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_All_Selected_Options {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//second line of code
		driver.manage().window().maximize();
																		
		//navigate to demo web shop
		driver.navigate().to("https://demoqa.com/select-menu");
		
		//creating the object of select class
		Select select = new Select(driver.findElement(By.id("cars")));
		
		select.selectByValue("Audi");
		select.selectByIndex(1);
		
		//capturing all selected options 
		List<WebElement> selectedOptions=select.getAllSelectedOptions();
		
		for (WebElement webElement : selectedOptions) {
			System.out.println(webElement.getText());
		}
	}

}
