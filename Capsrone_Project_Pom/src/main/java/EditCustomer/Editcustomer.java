package EditCustomer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import Loginlevel.HomePage;

public class Editcustomer extends Base{


	@FindBy(xpath="//input[@name='uid']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement LoginButton;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[3]/a")
	WebElement editbtn;
	
	
	@FindBy(xpath="//input[@type='text']")
	WebElement ctrid;

	@FindBy(xpath="//input[@type='submit']")
	WebElement subbtn;
	
	
	//Initializing the Page Objects:
	public Editcustomer() throws IOException {
	PageFactory.initElements(driver, this);
	}

	
	public void editcustomer(String un, String pwd) throws IOException{
		/*
		 * Performing actions on identified objects
		 */
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginButton.click();
		editbtn.click();
		ctrid.sendKeys("98754");
		subbtn.click();
		
}


	}





