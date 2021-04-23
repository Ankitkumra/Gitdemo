package Btes_HRMPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Btes_HRMTestBase.Testbase;

public class HomePage extends Testbase{

	Actions act = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 5);
	
	//Homepage
	@FindBy(linkText="Change Password")
	WebElement ChangePswrd;

	@FindBy(linkText="Logout")
	WebElement Logout;


	@FindBy(name="loc_name")
	WebElement SearchFor;	

	@FindBy(xpath="//*[@id=\"loc_code\"]/option[3]")
	WebElement SearchBy;

	@FindBy(xpath="//*[@class=\"plainbtn\"]")
	WebElement Search;

	@FindBy(xpath="//*[@id=\"companyLogoHeader\"]")
	WebElement logo;

	//Functions
	@FindBy(linkText="Admin")
	WebElement adm;

	@FindBy(linkText="Project Info")
	WebElement ProInfo;

	@FindBy(linkText="PIM")
	WebElement Pim;

	@FindBy(linkText="Reports")
	WebElement Reports;

	@FindBy(xpath="//*[@class=\"checkbox\"]")
	WebElement checkbox;
	
	
	@FindBy(xpath="//*[@class=\"DESC\"]")
	WebElement EmployeId;
	
	@FindBy(xpath="//a[text()='Employee Id							']")
	WebElement EmployeID;
	
	@FindBy(linkText="Employee Name ")
	WebElement EmployeName;

	@FindBy(linkText="Job Title")
	WebElement JobTitle;
	
	@FindBy(linkText="\r\n"
			+ "										zcxv  scvczvcz")
	WebElement name;
	
	
	@FindBy(xpath="//*[@id=\"standardView\"]/table/tbody/tr[1]/td[3]/a")
	WebElement sample;
	
	public HomePage() {
		PageFactory.initElements(driver, this);


	}

	public void BtesLogo() {
		System.out.println("logo is displayed:"+logo.isDisplayed());
	}

	public void Avail_Functions() {

		act.moveToElement(adm).build().perform(); 
		act.moveToElement(Pim).build().perform();
		act.moveToElement(Reports).build().perform();
	}
		
	public void Sub_functions()
	{
		//wait.until(ExpectedConditions.elementToBeClickable(EmployeID));
		//checkbox.click();
		sample.click();
		/*name.click();
		EmployeID.click();
		EmployeName.click();
		JobTitle.click(); */
		
	}
	public void Avail_ChangePassword() {

		System.out.println("Change Password Text:"+ChangePswrd.getText());
	}

	public void Avail_logout()
	{
		System.out.println("Logout Text:"+Logout.getText());
	}
}


