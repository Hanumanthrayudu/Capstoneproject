package TestCase;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.Base;
import EditCustomer.Editcustomer;
import LoginValidation.Validation;

public class TC_004 extends Base{
Editcustomer edt;
	public TC_004() throws IOException {
		super();
		
	}



	@BeforeMethod 
	public void SSSetUp() throws IOException, InterruptedException {
	
	 initialization();
		
		edt=new Editcustomer();	
	}
	@Test
	public void Editcustomer() throws IOException, InterruptedException
	{
	edt.editcustomer(prop.getProperty("username"), prop.getProperty("password"));
	
}
}





