package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import automation_core.Base;
import utilities.ExelUtility;

//import com.selenium.basics.DemoWebLogin;

public class Login_Page_Test extends Base
{
	public void logCommandcorrect()
	{
		String username=ExelUtility.get_Stringdata(0, 0, "LoginTest");
		String password=ExelUtility.get_Integerdata(0, 1, "LoginTest");
		WebElement forgott=driver.findElement(By.xpath("//a[@class='btn btn-link']"));
		forgott.click();
	}
	
	public static void main(String[] args)
	{
		Login_Page_Test obj=new Login_Page_Test();
		obj.logCommandcorrect();
		
	}
}
