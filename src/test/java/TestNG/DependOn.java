package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOn {
	@Test
	public void createAccount() {
		''
		Reporter.log("Account is created",true);
	}
	
	@Test( priority = 2 , dependsOnMethods="createAccount")
	public void editAccount() {
		Reporter.log("Account is edited",true);
	}
	
	@Test(priority = 3 ,dependsOnMethods="createAccount")
	public void deleteAccount() {
		Reporter.log("Account is deleted",true);
	}

}
