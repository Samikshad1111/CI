package EXAMPLE;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver; 
  @Test
  public void testEasy() {
	  driver.get("http://demo.website.com/test/home/");  
	  String title = driver.getTitle();  
	  Assert.assertTrue(title.contains("Demo Guru99 Page"));  
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.getProperty("webdriverdriver.chromedriver",projectpath+"/JENKINSPROJECT/src/Browser/chromedriver.exe");
		 driver = new ChromeDriver();
	  //driver = new FirefoxDriver();  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit(); 
  }

}
