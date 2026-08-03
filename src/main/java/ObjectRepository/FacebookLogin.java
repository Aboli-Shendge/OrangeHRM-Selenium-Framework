package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
	public FacebookLogin(WebDriver driver) {
		
		PageFactory.initElements( driver, this);
	}

		@FindBy(id = "email")
        private  WebElement usernameElement;
		
		public WebElement getUsernameElement() {
			return usernameElement;
		}
		@FindBy(name = " pass")
        private  WebElement passwordElement;

		public WebElement getPasswordElement() {
			return passwordElement;
		}

		@FindBy(name = "email")
        private  WebElement loginElement;

		public WebElement getLoginElement() {
			return loginElement;
		}

	}


