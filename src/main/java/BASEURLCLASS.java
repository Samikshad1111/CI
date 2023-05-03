import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BASEURLCLASS {
	public WebDriver driver;
	@BeforeMethod
	public void initialiseBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",  "//home//dhiadmin//testingsoftware//chromedriver.exe");
		driver =new ChromeDriver();

		driver.manage().window().maximize();
		 driver.get("https://app.indhi.io"); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  Thread.sleep(5000);
		
		
		
		}



	@AfterMethod
	public void postcondition() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
		}


	}

