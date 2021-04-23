package Btes_HRMPages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Btes_HRMTestBase.Testbase;

public class LoginPage extends Testbase{
	


	@FindBy(name="txtUserName")
	WebElement uname;

	@FindBy(name="txtPassword")
	WebElement pswd;

	@FindBy(name="Submit")
	WebElement sub;

	@FindBy(linkText="Logout")
	WebElement Logout;

	@FindBy(name="clear")
	WebElement clr;


	public LoginPage() {
		PageFactory.initElements(driver, this);
		
		
	}

	public String verifyTitle() {

		return driver.getTitle();

	}

	public void SubmitButton_clearButton() {	

		boolean visofButton = sub.isDisplayed();
		System.out.println("button is there:" + visofButton);
		boolean visofClearButton = clr.isDisplayed();
		System.out.println("clear button is there:" + visofClearButton);
	}


	

	public void login() {

		uname.sendKeys(prop.getProperty("admin"));
		pswd.sendKeys(prop.getProperty("password"));
		sub.click();
		//Logout.click();
	}

	public void inv_login() {

		uname.sendKeys(prop.getProperty("username"));
		pswd.sendKeys(prop.getProperty("inv_password"));
		sub.click();

	}
	public void inv_login1() {

		uname.sendKeys(prop.getProperty("inv_username1"));
		pswd.sendKeys(prop.getProperty("password1"));
		sub.click();

	}
	
	public WebElement Avail_SButton() {
		return sub;
	}
	
	public	WebElement Func_CButton() {
		return clr;
	}

}



