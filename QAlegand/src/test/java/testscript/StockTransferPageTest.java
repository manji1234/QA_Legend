package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base_Class;
import constants.Constants;
import constants.Messages;
import pageobject.HomePage;
import pageobject.ListAllStockTransferPage;
import pageobject.LoginPage;
import pageobject.StockTransferPage;

import utilities.ExelUtility;

public class StockTransferPageTest extends Base_Class
{
@Test
	public void verify_list_StockTransfer() 
	{

	String user_name=ExelUtility.get_Stringdata(0, 0, Constants.LOGINPAGE);
	String pass_word=ExelUtility.get_Integerdata(0, 1, Constants.LOGINPAGE);
	String stocks=ExelUtility.get_Stringdata(0, 0, Constants.STOCKTRANSFER);

	LoginPage login=new LoginPage(driver);
	 login.enter_Username(user_name);
	 login.enter_Password(pass_word);
	 HomePage home=login.click_onLogin_Button();
	 home.clic_ONalertButton();
	 StockTransferPage stocktransfer=home.click_On_Stock_Transfer();
	 ListAllStockTransferPage liststocktransfer=stocktransfer.click_On_List_Stock_Transfer();
	 liststocktransfer.Enter_Searh_Item(stocks);
	 String actualdata=liststocktransfer.get_Table_Data();
	 Assert.assertEquals(actualdata, stocks,Messages.INVALIDSTOCKSEARCH);
	}
}
	