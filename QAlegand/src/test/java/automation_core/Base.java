package automation_core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
 public WebDriver driver;
 public void initializeBrowser(String browsername)
 {
	if(browsername.equals("Chrome"))
			{
		      driver=new ChromeDriver();
			}
	else if(browsername.equals("Edge"))
	{
		driver=new EdgeDriver();
	}
	else if(browsername.equals("Firefox"))
	{
		driver=new FirefoxDriver();
	}
	else
	{                  
		throw new RuntimeException("Invalid Browser Received");
	}
	driver.manage().window().maximize();
	driver.get("https://qalegend.com/billing/public/login");
 }
 @BeforeMethod
 public void setup()
 {
	 initializeBrowser("Chrome");   
 }
 @AfterMethod
 public void closeBrowser()
 {
	
	 driver.close();
 }
}