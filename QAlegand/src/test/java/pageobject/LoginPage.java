package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);    
	}
	@FindBy(id="username")
	WebElement username_field;
	@FindBy(id="password")
	WebElement password_field;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement login_button;
    @FindBy(xpath="//a[@class='btn btn-link']")
	WebElement forgot_password_button;
    @FindBy(xpath="//span[@class='help-block']")
	WebElement result_message_fld;

	public void enter_Username(String username)
	{
		username_field.sendKeys(username);
		
	}
	public void enter_Password(String password)
	{
		password_field.sendKeys(password);
	}
	public HomePage click_onLogin_Button()  //should return
	{
		login_button.click();
		           //constructor
		return new HomePage(driver);
	}
	public void login_button_click()
	{
		login_button.click();
	}
	public String get_DisplayMessage()
	{
		String textmessage=result_message_fld.getText();
		return textmessage;
	}
	public RestPage Click_Onforgot_password()
	{
		forgot_password_button.click();
		return new RestPage(driver);
	}
}
