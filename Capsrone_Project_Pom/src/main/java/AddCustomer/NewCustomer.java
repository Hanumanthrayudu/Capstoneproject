package AddCustomer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import Loginlevel.HomePage;

public class NewCustomer extends Base {


	

	@FindBy(xpath="//input[@name='uid']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//*[contains(@type,'submit')]")
	WebElement LoginButton;
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")   ////a[text()='New Customer']
	WebElement newcustomer;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement name;
	
	@FindBy(xpath="//input[@type='radio'][1]")
	WebElement radiobut;
	
	@FindBy(xpath="//input[@type='date']")
	WebElement dob;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	

	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pin;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement phoneNo;
	
	

	@FindBy(xpath="//input[@name='emailid']")
	WebElement email;
	

	@FindBy(xpath="//input[@type='password']")
	WebElement pssword;
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//p[text()='Customer Registered Successfully!!!']")
	WebElement sussmsg;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]")
	WebElement custid;
	
	
	//Initializing the Page Objects:
	public NewCustomer() throws IOException {
	PageFactory.initElements(driver, this);
	}
	
	public void registration(String un, String pwd) throws InterruptedException{
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginButton.click();
		Thread.sleep(2000);
		newcustomer.click();
		name.sendKeys("Hanumanth yadav");
		radiobut.click();
		dob.sendKeys("2022-02-17");
		address.sendKeys("hanumanth yadav kambadur");
		pin.sendKeys("515001");
		phoneNo.sendKeys("6303971029");
		email.sendKeys("hanumanthyadav105@gmail.com");
		pssword.sendKeys("6303971029");
		submit.click();
		sussmsg.getText();
		System.out.println(sussmsg);
		custid.getText();
		System.out.println(custid);
		
	}
		
}
	


