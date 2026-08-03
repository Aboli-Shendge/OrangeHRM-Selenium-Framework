import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks {
	public static void main(String[] args ) throws InterruptedException {
		
		//firdst line of code
		WebDriver driver = new ChromeDriver();
		
		//open amezon website
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//capture all the links present on the page
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Total links:" + links.size());
		
		for (WebElement l : links) {
			System.out.println(l.getText());
		}
			driver.findElement(By.partialLinkText("sell on Amazon")).click();
			
			Thread.sleep(3000);
			driver.quit();
		}
		
	}
