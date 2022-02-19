package TestCase;


	

	import java.io.IOException;

	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import BaseClass.Base;
import Loginlevel.LoginPage;



	public class TC_001 extends Base {
			public LoginPage lp;
			//Step 1
			public TC_001() throws IOException {
				super();
			}
			//Step2
			
			@BeforeMethod 
			public void SSSetUp() throws IOException, InterruptedException {
			
			initialization();
				
				lp=new LoginPage();	
			}
			@Test
			public void validateLogin() throws IOException, InterruptedException
			{
				lp.userlogin(prop.getProperty("username"), prop.getProperty("password"));
			
			}
		}



