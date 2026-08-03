package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test
	public void createAccount() {
		Reporter.log("Account is created",true);
	}
	
	@Test( invocationCount = 0 )
	public void editAccount() {
		Reporter.log("Account is edited",true);
	}
	
	@Test(enabled = false)
	public void deleteAccount() {
		Reporter.log("Account is deleted",true);
	}


}


