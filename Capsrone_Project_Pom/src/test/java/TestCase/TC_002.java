package TestCase;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.Base;
import LoginValidation.Validation;



public class TC_002 extends Base {
public Validation vld;

	public TC_002() throws IOException {
		super();
		
	}


	@BeforeMethod 
	public void SSSetUp() throws IOException, InterruptedException {
	
	  initialization();
		
		vld=new Validation();	
	}
	@Test
	public void validateLogin() throws IOException, InterruptedException
	{
		//vld.invaliduserlogin(prop.getProperty("username1"), prop.getProperty("password1"));
	vld.invaliduserlogin("hanumanth", "yadav");
	}
	
}

	

