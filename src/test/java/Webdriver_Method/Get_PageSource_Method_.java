
package Webdriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_PageSource_Method_ {

	public static void main(String[] args) {
		 
		//first line of code
		WebDriver driver =new ChromeDriver();
		
		//navigate to facebook
		driver.get("https://www.facebook.com");
		
		//capturing the html code of the facebook url;
		String sourceCode =driver.getPageSource();
		
		//printing the source code 
		System.out.println("HTML code of facebook login page:"+sourceCode);
		
		System.out.println("does the line //Facebook helps you connect and share "
				+ "with the people in your life.//is present inside the source code");
		
		//verification 
		if(sourceCode.contains("Facebook helps you connect and share with the people"
				+ " in your life.")){
         System.out.println("s it is present");
	    }
	    else {
		 System.out.println("no it is not present");
	}

   }
}


