package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser 
{
	WebDriver driver;
	public AddUser(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);     
	}
	@FindBy(id="surname")
	WebElement prefixfield;
	@FindBy(id="first_name")
	WebElement firstnamefield;
	@FindBy(id="last_name")
	WebElement lastnamefield;
	@FindBy(id="email")
	WebElement emailfield;
	@FindBy(id="select2-role-container")
	WebElement rolefield;
	@FindBy(id="username")
	WebElement usernamefield;
	@FindBy(id="password")
	WebElement passwordfield;
	@FindBy(id="confirm_password")
	WebElement confirmpasswordfield;
	@FindBy(id="cmmsn_percent")
	WebElement salespercentagefield;
	
	@FindBy(id="submit_user_button")
	WebElement savefield;
	
	public void enterPrefix()
	{
		prefixfield.sendKeys("prefix");
	}
	public void enterFirstName()
	{
		firstnamefield.sendKeys("firstname");
	}
	public void enterLastName()
	{
		lastnamefield.sendKeys("lastname");
	}
	public void enteremail()
	{
		emailfield.sendKeys("email");
	}
	public void enterRole()
	{
		rolefield.sendKeys("role");
	}
	public void enterUsername()
	{
		usernamefield.sendKeys("username");
	}
	public void enterPassword()
	{
		passwordfield.sendKeys("password");
	}
	public void enterConfirmPassword()
	{
		confirmpasswordfield.sendKeys("confirmpassword");
	}
	public void enterSalesPercentage()
	{
		salespercentagefield.sendKeys("salespercentage");
	}
	public void clickSave()
	{
		savefield.click();
	}
}
