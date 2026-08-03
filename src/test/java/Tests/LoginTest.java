package Tests;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Pages.DashboardPage;
import Pages.LoginPage;
import Reports.ExtentManager;
import ScreenshotUtils.CaptureScreenshot;
import Utils.BaseClass;

public class LoginTest extends BaseClass {

    LoginPage login;
    DashboardPage dashboard;

    ExtentReports extent;
    ExtentTest test;

    @BeforeMethod
    public void setUp() {

        launchBrowser();

        login = new LoginPage(driver);
        dashboard = new DashboardPage(driver);

        extent = ExtentManager.getReport();
        test = extent.createTest("Login Test");
    }

    @Test
    public void loginTest() {

        login.enterUsername(config.getUsername());
        login.enterPassword(config.getPassword());
        login.clickLogin();

        Assert.assertTrue(dashboard.verifyDashboard(), "Login Failed");

        test.pass("Login Successful");

        dashboard.clickProfile();
        dashboard.clickLogout();

        Assert.assertTrue(driver.getCurrentUrl().contains("login"), "Logout Failed");

        test.pass("Logout Successful");
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {

            test.fail(result.getThrowable());

            CaptureScreenshot.takeScreenshot(driver, result.getName());

        } else {

            test.pass("Test Passed");

        }

        extent.flush();

        closeBrowser();
    }
}