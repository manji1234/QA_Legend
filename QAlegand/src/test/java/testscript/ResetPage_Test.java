package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base_Class;
import constants.Constants;
import constants.Messages;
import pageobject.LoginPage;
import pageobject.RestPage;
import utilities.ExelUtility;

public class ResetPage_Test extends Base_Class
{
	@Test
	public void verify_errorMsg_withInvalid_emailAddress()
	 {
		 String email=ExelUtility.get_Stringdata(0, 0, Constants.INVALIDRESETPAGE);
		 LoginPage login=new LoginPage(driver);
		 RestPage reset=login.Click_Onforgot_password();
		 reset.enter_emailId(email);
		 reset.click_onReset_Button();
		 String actual_result=reset.getError_MessageText(email);
		 String expectederror_msg=ExelUtility.get_Stringdata(1, 0, Constants.INVALIDRESETPAGE);
		 String expected_result=expectederror_msg;
		 Assert.assertEquals(actual_result, expected_result, Messages.RESETFAILED);
		 
		 
		 
		 
	 }
	 @Test
	 public void verify_paswrdReset_withValid_emailAddress()
	 {
		 String email_id=ExelUtility.get_Stringdata(0, 0, Constants.VALIDRESETPAGE);
		 LoginPage login=new LoginPage(driver);
		 RestPage reset=login.Click_Onforgot_password();
		 reset.enter_emailId(email_id);
		 reset.click_onReset_Button();
		 String expected_result=ExelUtility.get_Stringdata(1, 0, Constants.VALIDRESETPAGE);
		 String actual_result=reset.get_SuccessMessage_Display();
		 Assert.assertEquals(actual_result,expected_result, Messages.RESETPASS);
		
		
		
		 
	 }
}
