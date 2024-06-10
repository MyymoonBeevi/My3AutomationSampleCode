package testclass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.ProjectMethods;


public class SampleTestclass extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="Sample Test automation";
		testDescription="GMAIL Automation";
		testNodes="Base";
		category="Smoke";
		authors="Ramesh";
		browserName="chrome";
		dataSheetName="testdata";
	} 
	

	@Test
	public static void main()
	{
		LoginPage login = new LoginPage();
		
		login
		.enter_username()
		.click_Next()
		.enter_password()
		.click_Next();
	}
	
	
}
