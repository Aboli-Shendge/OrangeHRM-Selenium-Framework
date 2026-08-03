package Learning_Switching_Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Windows_Tab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// first line of code 
		WebDriver driver = new ChromeDriver();
																													
		//second line of code
		driver.manage().window().maximize();
																				
		//navigate to flipkart
		driver.get("https://demowebshop.tricentis.com/");
		
		//Click on Facebook link
		driver.findElement(By.linkText("Facebook")).click();
		
		//capturing all session id
	    Set<String> allSessionID = driver.getWindowHandles();
	    
	    //capturing current window session id
		String originalHandle = driver.getWindowHandle();
		
		//remove the cirrent window's session id
		allSessionID.remove(originalHandle);
			
		for (String handle : allSessionID) {
			//switching to facebook webpage
			    driver.switchTo().window(handle);
			    
			    Thread.sleep(2000);
			    System.out.println(driver.getTitle());
			}
						
	}

}
