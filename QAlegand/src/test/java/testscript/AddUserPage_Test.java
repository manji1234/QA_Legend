package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation_core.Base;

public class AddUserPage_Test extends Base
{
public void addUser()
{
	WebElement prefix=driver.findElement(By.id("surname"));
	prefix.sendKeys();
	WebElement firstname=driver.findElement(By.id("first_name"));
	firstname.sendKeys();
	WebElement lastname=driver.findElement(By.id("last_name"));
	lastname.sendKeys();
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys();
	WebElement role=driver.findElement(By.id("select2-role-container"));
	role.sendKeys();
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys();
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys();
	WebElement confirmpassword=driver.findElement(By.id("confirm_password"));
	confirmpassword.sendKeys();
	WebElement salespercentage=driver.findElement(By.id("cmmsn_percent"));
	salespercentage.sendKeys();
	
	WebElement save=driver.findElement(By.id("submit_user_button"));
	save.click();
}
}
