package LoginValidation;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import Loginlevel.HomePage;

public class Validation extends Base {
		
	

	@FindBy(xpath="//input[@name='uid']")
	WebElement username1;
	
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password1;
	
	@FindBy(xpath="//*[contains(@type,'submit')]")
	WebElement LoginButton;
	
	//Initializing the Page Objects:
		public Validation() throws IOException {
		PageFactory.initElements(driver, this);
		}
		
	
	//Alert alt= driver.switchTo().alert();
	
	public void invaliduserlogin(String un1, String pwd1) throws IOException, InterruptedException{
		
		username1.sendKeys(un1);
		password1.sendKeys(pwd1);
		LoginButton.click();
		Alert alt= driver.switchTo().alert();
		String errormsg=alt.getText();
		System.out.println(errormsg);
		alt.accept();
		Thread.sleep(2000);
	
		
	}
}
