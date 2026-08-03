package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//first line of code
		 WebDriver driver = new ChromeDriver();
				
		//second line of code
	   	driver.manage().window().maximize();
	   	
	   	 driver.get("https://the-internet.herokuapp.com/iframe");
	   	 
	   //Close the popup
	   	driver.findElement(By.xpath("//button[@class='tox-notification__dismiss tox-button tox-button--naked tox-button--icon']")).click();
	   	//Switch the control from parent web page to frame
	   	driver.switchTo().frame(0);
	    Thread.sleep(1000);
	    //Locate the p element
	   	WebElement pElement = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
	   	System.out.println(pElement.getText());

	}

}
