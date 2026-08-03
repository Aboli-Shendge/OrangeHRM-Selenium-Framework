package Handling_Multiples_Elements;

import java.util.List;  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturing_Multiple_Elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
																					
		//second line of code
		driver.manage().window().maximize();
												
		//navigate to flipkart
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		//capture all the anchor elements in the web page 
		List<WebElement> anchorElement=driver.findElements(By.tagName("a"));
			
		//printing the link text of all the anchor
		for (WebElement anchorElement1 : anchorElement) {
			System.out.println(anchorElement1.getText());
			
		}
		driver.quit();
	}

}
