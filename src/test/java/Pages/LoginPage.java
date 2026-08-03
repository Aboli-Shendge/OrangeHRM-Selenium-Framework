package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utils.WaitUtils;

public class LoginPage {

	    WebDriver driver;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    By username = By.name("username");
	    By password = By.name("password");
	    By loginButton = By.xpath("//button[@type='submit']");
	    
	    public void enterUsername(String uname) {
	        WaitUtils.wait.until(ExpectedConditions.visibilityOfElementLocated(username));
	        driver.findElement(username).sendKeys(uname);
	    }

	    public void enterPassword(String pass) {
	        WaitUtils.wait.until(ExpectedConditions.visibilityOfElementLocated(password));
	        driver.findElement(password).sendKeys(pass);
	    }

	    public void clickLogin() {
	        WaitUtils.wait.until(ExpectedConditions.elementToBeClickable(loginButton));
	        driver.findElement(loginButton).click();
	    }

	}


