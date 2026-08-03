package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 0 ,priority = 1 )
	public void createAccount() {
		Reporter.log("Account is created",true);
	}
	
	@Test( invocationCount = 2 , priority = 2 )
	public void editAccount() {
		Reporter.log("Account is edited",true);
	}
	
	@Test(priority = 3 )
	public void deleteAccount() {
		Reporter.log("Account is deleted",true);
	}


}
