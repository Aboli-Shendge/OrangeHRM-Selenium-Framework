package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateAcc {
	@Test
	
	public void createAccount() {
		
		//System.out.println("Account is created");
		Reporter.log("Account is created",true);
	}

}
