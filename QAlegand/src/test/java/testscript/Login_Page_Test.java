package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import automation_core.Base_Class;
import constants.Constants;
import constants.Messages;
import dataprovider.DataProviders;
import pageobject.HomePage;
import pageobject.LoginPage;
import utilities.ExelUtility;


public class Login_Page_Test extends Base_Class
{
	@Test
	
	 public void verify_Login_With_Valid_Credentials()
	 {
		String user_name=ExelUtility.get_Stringdata(0, 0, Constants.LOGINPAGE);
		String pass_word=ExelUtility.get_Integerdata(0, 1, Constants.LOGINPAGE);
	   	String expected_result=Constants.MESSAGE+ExelUtility.get_Stringdata(1, 0, Constants.LOGINPAGE)+Constants.LOGINPAGEEXTENSION;
		 LoginPage login=new LoginPage(driver);
		 login.enter_Username(user_name);
		 login.enter_Password(pass_word);
		 HomePage home=login.click_onLogin_Button(); 
		 String actual_result=home.get_MessageDisplay();
		 Assert.assertEquals(actual_result, expected_result, Messages.LOGINFAILED);
		
	 }
	
	@Test(dataProvider="Invalidusercredentials", dataProviderClass=DataProviders.class)

	 public void verify_errorMessage_whileLogin_withInvalid_credentials(String username, String password)
	 {
		 LoginPage login=new LoginPage(driver);
		 login.enter_Username(username);
		 login.enter_Password(password);
	     login.login_button_click();
	     String actual_result=login.get_DisplayMessage();
		 String expected_result=ExelUtility.get_Stringdata(2, 0, Constants.LOGINPAGE);
		 Assert.assertEquals(actual_result, expected_result, Messages.INVALIDCREDENTIAL);
		
	 }
	
	
	
}
