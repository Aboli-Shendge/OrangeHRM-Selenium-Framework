import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class Chrome_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Tell Selenium where ChromeDriver is
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
 
        
        // Create a ChromeDriver object
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Print the page title in console
        System.out.println("Title: " + driver.getTitle());

        // Close the browser
        driver.quit();

	}

}
