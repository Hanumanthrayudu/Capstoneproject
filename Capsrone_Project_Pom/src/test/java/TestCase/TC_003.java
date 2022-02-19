package TestCase;

import java.io.IOException;

import org.junit.Test;
import org.testng.annotations.BeforeMethod;

import AddCustomer.NewCustomer;
import BaseClass.Base;
import LoginValidation.Validation;

public class TC_003 extends Base{
	
	public NewCustomer nct;

	public TC_003() throws IOException {
		super();
	}
	@BeforeMethod 
	public void SSSetUp() throws IOException, InterruptedException {
	
	 initialization();
		
	nct=new NewCustomer ();	
	}
@Test
	public void customwerlogin() throws IOException, InterruptedException
	{
		nct.registration(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	
	
}