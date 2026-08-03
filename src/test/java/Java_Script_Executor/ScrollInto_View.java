package Java_Script_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollInto_View {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();																	
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		//downcast the reference variable
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//locate the element 
		WebElement india = driver.findElement(By.xpath("//img[@alt = 'India']"));
		
		//scroll the element
		js.executeScript("arguments[0].scrollIntoView(true);", india);
		
		Thread.sleep(2000);
		
		//js.executeScript("arguments[0].scrollIntoView(false);", india);
		
		js.executeScript("arguments[0].click()", india);
		
		

	}

}
