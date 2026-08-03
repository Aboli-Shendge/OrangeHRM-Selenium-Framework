import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class TestChrome {
	    public static void main(String[] args) {
	    	
	    	// Set the path to your ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");

	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Open Google
	        driver.get("https://www.google.com");

	        // Print the page title to console
	        System.out.println("Page title is: " + driver.getTitle());

	        // Close the browser
	        driver.quit();
	}

}
	