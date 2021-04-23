package Btes_HRMTest;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Btes_HRMPages.LoginPage;
import Btes_HRMTestBase.Testbase;

public class LoginTest extends Testbase {

	LoginPage lp;
	String title;

	public LoginTest() {
		super();
	}
	
	@BeforeSuite
	public void Launch() {
		intilization();
		lp = new LoginPage();
	}

	@Test
	public void Check_title() {
		title=lp.verifyTitle();
		Assert.assertEquals(title, "BTES HRM");
	}
	
	
	@Test 
	public void Avail_Funct_Button() {
		lp.SubmitButton_clearButton();
	}

	
	@Test
	public void login_user() {

		lp.login();	
	}

	@Test
	public void Invlogin_user() {

		lp.inv_login();
	}

	@Test
	public void Invlogin_user1() {

		lp.inv_login1();
	}



	@AfterSuite
	public void close()
	{
		driver.close();
	}
}







