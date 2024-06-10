package pages;

import org.openqa.selenium.WebElement;

import utils.SeMethods;


public class LoginPage extends SeMethods{
	
	public LoginPage enter_username()
	{
		/* startApp("Chrome",false); */
		WebElement enterUserName = locateElement("xpath","//input[@id =  'identifierId']");
		type(enterUserName, "ramesh93sankar@gmail.com");
		return this;
	}
	
	public LoginPage enter_password()
	{
		WebElement enterPassword = locateElement("xpath","//input[@name = 'password']");
		type(enterPassword, "rameshpalani24");
		return this;
	}
	
	public LoginPage click_Next()
	{
	WebElement clickNext = locateElement("xpath","(//*[contains(text(),'Next')])[2]");
	click(clickNext);
	return this;
	}
	

}
