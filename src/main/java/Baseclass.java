

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//baseclass have info  url to hit and driver used during testing 
public class Baseclass 
{
public WebDriver driver;
@BeforeMethod
public void initialiseBrowser() {
	
	System.setProperty("webdriver.chrome.driver",  "//home//dhiadmin//testingsoftware//chromedriver.exe");
	driver =new ChromeDriver();

	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	
	
	
	}



@AfterMethod
public void postcondition()
{
	driver.close();
	}


}
