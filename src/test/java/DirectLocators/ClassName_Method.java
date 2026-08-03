package DirectLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName_Method {

	public static void main(String[] args) throws InterruptedException{
	
		// first line of code 
				WebDriver driver = new ChromeDriver();
				
				//second line of code
				driver.manage().window().maximize();
						
				//navigate to facebook
				driver.get(("https://www.facebook.com"));
					
				Thread.sleep(3000);
				//locate the login button and click it
				driver.findElement(By.className("x1ey2m1c xtijo5x x1o0tod xg01cxk x47corl x10l6tqk x13vifvy x1ebt8du x19991ni x1dhq9h x1fmog5m xu25z0z x140muxe xo1y3bh")).click();
						
				Thread.sleep(3000);
						
				driver.quit();

	}

}
