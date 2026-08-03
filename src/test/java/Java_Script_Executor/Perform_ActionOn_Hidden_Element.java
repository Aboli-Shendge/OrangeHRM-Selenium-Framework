package Java_Script_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Perform_ActionOn_Hidden_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		    
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    
		 driver.get("https://www.facebook.com/r.php?entry_point=login");
		 
		//downcast the reference variable
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 WebElement hiddenElement = driver.findElement(By.id("custom_gender"));
		 
		 System.out.println(hiddenElement.getAttribute("vfrrwr"));
		 
		 //entering data
		 js.executeScript("arguments[0].value='prefer not to mention'", hiddenElement);
		  

	}

}
