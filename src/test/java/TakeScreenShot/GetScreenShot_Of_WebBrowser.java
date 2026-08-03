package TakeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class GetScreenShot_Of_WebBrowser {
	@Test
	public  void ScreenShot() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//downcast the ref
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//take the screen shot of web page 
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		//Creating a file
		File dest = new File("C:\\Users\\shend\\eclipse-workspace\\BASIC-Selenium\\ScreenShot\\screenshot.jpg");
		
		//performing copy and paste  action
		FileHandler.copy(temp, dest);
	}

}
