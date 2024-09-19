package testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import automation_core.Base_Class;
import constants.Constants;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.UsersManagementPage;
import pageobject.UsersPage;
import utilities.ExelUtility;
import utilities.RandomDataUtility;

public class UserActionsPageTest extends Base_Class {
	@Test
	public void verify_UserEdit_Action()
	{
	 String username=ExelUtility.get_Stringdata(0, 0, Constants.ACTIONPAGE);
	 String password=ExelUtility.get_Integerdata(0, 1, Constants.ACTIONPAGE);
	 String search_uname=ExelUtility.get_Stringdata(1, 0, Constants.ACTIONPAGE);
	 String edit_lname=ExelUtility.get_Stringdata(2, 0, Constants.ACTIONPAGE);
	 
     LoginPage login=new LoginPage(driver); 
	 login.enter_Username(username);
	 login.enter_Password(password);
	 HomePage home=login.click_onLogin_Button();
	 home.clic_ONalertButton();
	 UsersManagementPage usermanagement=home.clickON_UserManagement_Field();
	 UsersPage users=usermanagement.clickOn_users_field();
	 users.search_User(search_uname);

	 
	}
	
	@Test
	public void verify_ViewUser_Page()
	{
		 String username=ExelUtility.get_Stringdata(0, 0, Constants.ACTIONPAGE);
		 String password=ExelUtility.get_Integerdata(0, 1, Constants.ACTIONPAGE);
		 String search_uname=ExelUtility.get_Stringdata(1, 0, Constants.ACTIONPAGE);
		 LoginPage login=new LoginPage(driver); 
		 login.enter_Username(username);
		 login.enter_Password(password);
		 HomePage home=login.click_onLogin_Button();
		 home.clic_ONalertButton();
		 UsersManagementPage usermanagement=home.clickON_UserManagement_Field();
		 UsersPage users=usermanagement.clickOn_users_field();
		 users.search_User(search_uname);
	
	}

}