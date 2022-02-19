package Loginlevel;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import BaseClass.Base;

public class LoginPage extends Base{
	
	
	String title= "Guru99BankManagerHomePage";
	String Managerid=" mngr385763";
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement LoginButton;
	
	@FindBy(xpath="//td[text()='Manger Id : mngr385763']")
	WebElement mangerid;
	

	
	
	//Initializing the Page Objects:
	public LoginPage() throws IOException {
	PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean demo()
	{
		mangerid.isDisplayed();
		return true;
	}
	//Action - validate Login and action on Elements
	public void userlogin(String un, String pwd) throws IOException{
		/*
		 * Performing actions on identified objects
		 */
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginButton.click();
	String title=	driver.getTitle();
		System.out.println("title:"+title);
	System.out.println(Managerid);
		//driver.navigate().back();
			//return new HomePage();
		
}	
			}




