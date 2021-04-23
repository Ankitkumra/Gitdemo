package Btes_HRMTest;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import Btes_HRMPages.HomePage;
import Btes_HRMPages.LoginPage;
import Btes_HRMTestBase.Testbase;

public class HomepageTest extends Testbase {


	HomePage HP;
	LoginPage NP;


	public HomepageTest() {
		super();
	}


	@BeforeSuite
	public void Launch() {
		intilization();
		HP = new HomePage();
		NP = new LoginPage();
	}

	@Test
	public void Check_Home_page()
	{
		NP.login();
		HP.BtesLogo();

	}

	@Test
	public void Main_functions()
	{
		HP.Avail_Functions();
	}


	 @Test
	public void Sub_functions()
	{
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		HP.Sub_functions();
	} 
	@Test
	public void Password() {
		HP.Avail_ChangePassword();
	}

	@Test
	public void Logout() {
		HP.Avail_logout();
	}

	@AfterSuite
	public void Close()
	{
		driver.close();
	}


}


