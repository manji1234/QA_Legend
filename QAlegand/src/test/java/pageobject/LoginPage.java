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
		PageFactory.initElements(driver, this);     //to initialize webdriver, page factorty in selenium package
	}
	@FindBy(id="username")
	WebElement usernamefield;
	@FindBy(id="password")
	WebElement passwordfield;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitfield;
	@FindBy(xpath="//a[@class='btn btn-link']")
	WebElement forgottfield;
	
	
	
	public void enterUserName()
	{
		usernamefield.sendKeys("username");
	}
	public void enterPassword()
	{
		passwordfield.sendKeys("password");
	}
	public void submit()
	{
		submitfield.submit();
	}
	public void forgott()
	{
		forgottfield.click();
	}
}
