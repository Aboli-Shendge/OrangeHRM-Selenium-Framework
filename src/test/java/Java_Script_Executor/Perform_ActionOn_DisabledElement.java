package Java_Script_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Perform_ActionOn_DisabledElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	    driver.get("https://www.oracle.com/java/technologies/javase-jdk23-doc-downloads.html");
	  
	    //downcast the reference variable
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   
	    //locate the element 
	    driver.findElement(By.xpath("//a[@data-type='java']")).click();
	   
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   
	    wait.until(
	    		ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='w11w4 w11initfocus']"))));
	    
	    //locate the disabled element
	    WebElement dissabledElement = driver.findElement(By.xpath("//a[@class='download-file icn-download']"));
	    
	    //click on disabled element
	    js.executeScript("arguments[0].click();", dissabledElement);

	}

}
