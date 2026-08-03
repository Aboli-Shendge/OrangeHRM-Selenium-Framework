package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class_Index {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// first line of code 
		WebDriver driver = new ChromeDriver();
																									
		//second line of code
		driver.manage().window().maximize();
																
		//navigate to flipkart
		driver.get("https://www.flipkart.com/");
		
		//Searching the home essensials in search field
		driver.findElement(By.xpath("//div[text()='Home Essentials']")).click();
		Thread.sleep(2000);
		
		//locating the select element
		WebElement selectElement = driver.findElement(By.xpath("//option[@value='Min']/parent::select"));
			
		//dispalying the options 
		selectElement.click();
		Thread.sleep(3000);
		
		//creating obj of the select class to handle select element
		Select select =  new Select(selectElement);
		
		//selecting 3rd option by index
		select.selectByIndex(2);

	}

}
