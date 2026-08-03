package Utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

	    public static WebDriverWait wait;

	    public static void initializeWait(WebDriver driver) {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    }
	}

