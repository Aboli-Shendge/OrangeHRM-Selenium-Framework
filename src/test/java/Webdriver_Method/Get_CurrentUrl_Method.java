package Webdriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_CurrentUrl_Method {

	public static void main(String[] args) {

		       //first line of code
				WebDriver driver =new ChromeDriver();
				
				//navigate to facebook app
				driver.get("https://www.facebook.com");
				
				String currentUrl = driver.getCurrentUrl();
				
				//verification
				
				if(currentUrl.contains("facebook")) {
					System.out.println("pass");				
				}
				
				else {
					
					System.out.println("fail");

			}
		}
	}

