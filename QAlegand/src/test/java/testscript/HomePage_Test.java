package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base_Class;
import constants.Constants;
import pageobject.HomePage;
import pageobject.LoginPage;
import utilities.ExelUtility;

public class HomePage_Test extends Base_Class
{
	@Test
	 public void verify_userLogin_date()
	 {
			String user_name=ExelUtility.get_Stringdata(0, 0, Constants.LOGINPAGE);
			String pass_word=ExelUtility.get_Integerdata(0, 1, Constants.LOGINPAGE);
		   	String expected_result=Constants.MESSAGE+ExelUtility.get_Stringdata(1, 0, Constants.LOGINPAGE)+Constants.LOGINPAGEEXTENSION;
			 LoginPage login=new LoginPage(driver);
			 login.enter_Username(user_name);
			 login.enter_Password(pass_word);
			 HomePage home=login.click_onLogin_Button();
			 home.clic_ONalertButton();
			 String homepage_Date=home.get_LoginDate();
			 String current_date=home.get_CurrentDate();
			 Assert.assertEquals(homepage_Date, current_date,"Date Missmatch" );
			 
	 }
		
			
			
}
