package Java_Script_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_By_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		//second line of code
		driver.manage().window().maximize();
																				
		//navigate to flipkart
		driver.get("https://demowebshop.tricentis.com/");
		
		//downcast the reference variable
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//execute the script
		js.executeScript("window.scrollBy(0,500)");
		

	}

}
