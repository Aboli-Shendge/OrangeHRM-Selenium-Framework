package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_TO_DefaultContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//div[contains(text(),'Elements')]")).click();

	}

}
