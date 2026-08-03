package DataDriven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingDataFromProperties {

	public static void main(String[] args) throws IOException {
		
		//open the file in read mode 
		FileInputStream file = new FileInputStream ("C:\\Users\\shend\\eclipse-workspace\\BASIC-Selenium\\src\\test\\resources\\FacebookCommonData.property");

		//create obj
		Properties prop = new Properties();
		
		//load all the keys 
		prop.load(file);
		
		//reading the keys
		String browser  = prop.getProperty("browser");
		String url      =  prop.getProperty("Url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("Password");
		
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		//cross browsing testing
		WebDriver driver = null;
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Firefox":
			driver = new FirefoxDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Enter a Valid Browser name");
			break;
		}
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(url);
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
       
		}

	}
 

