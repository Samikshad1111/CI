
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
public class a extends Baseclass{
	//private WebDriver driver;

	  @Test
	  public void testEasy() {
		  driver.get("https://app.indhi.io");  
		  String title = driver.getTitle();  
		  System.out.println(title);
		 Assert.assertTrue(title.contains("Indhi"));  
		  }
	  @Test
	  public void test_getCurrentUrl() {
		  driver.get("https://app.indhi.io");  
		  String title = driver.getCurrentUrl();  
		  System.out.println(title);
		 Assert.assertTrue(title.contains("https://app.indhi.io/"));  
		  }
	 
	
	}
