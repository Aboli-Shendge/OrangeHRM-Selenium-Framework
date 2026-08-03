package WebElemant.Getter_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// first line of code 
		WebDriver driver = new ChromeDriver();
																	
		//second line of code
		driver.manage().window().maximize();
																						
		//navigate to flipkart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		//locate the anchor element and capture the size 
		Dimension size=driver.findElement(By.xpath("//a")).getSize();
			
        System.out.println("Height :"+ size.getHeight());
        System.out.println("Width :"+ size.getWidth());
        driver.quit();
	}

}
