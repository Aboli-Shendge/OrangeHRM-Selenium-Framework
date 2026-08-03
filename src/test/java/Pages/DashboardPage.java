package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utils.WaitUtils;

public class DashboardPage {
	
	    WebDriver driver;

	    public DashboardPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    By dashboard = By.xpath("//h6[text()='Dashboard']");
	    By profile = By.xpath("//span[@class='oxd-userdropdown-tab']");
	    By logout = By.xpath("//a[text()='Logout']");

	    public boolean verifyDashboard() {
	        WaitUtils.wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard));
	        return driver.findElement(dashboard).isDisplayed();
	    }

	    public void clickProfile() {
	        WaitUtils.wait.until(ExpectedConditions.elementToBeClickable(profile));
	        driver.findElement(profile).click();
	    }

	    public void clickLogout() {
	        WaitUtils.wait.until(ExpectedConditions.elementToBeClickable(logout));
	        driver.findElement(logout).click();
	    }
	}
