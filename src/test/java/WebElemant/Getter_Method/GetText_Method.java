package WebElemant.Getter_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetText_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement UN =driver.findElement(By.name("username"));
		WebElement PW =driver.findElement(By.name("password"));
		Thread.sleep(2000);
		UN.clear();
		PW.clear();
		Thread.sleep(2000);
		UN.sendKeys("username");
		PW.sendKeys("12345678");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		String text = driver.findElement(By.id("validationMessage")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.quit();
		}
}
 