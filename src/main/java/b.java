import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

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
public class b extends BASEURLCLASS{

	  @Test
	  public void testEasy() throws InterruptedException {
		  //Thread.sleep(5000);
		  //driver.findElement(By.xpath("//input[@name='username']")).isDisplayed();
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dhi-samiksha");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(5000);
		  }
	 @Test
	  public void test_getCurrentUrl() {
		  driver.get("https://app.indhi.io");  
		  String title = driver.getCurrentUrl();  
		  System.out.println(title);
		 Assert.assertTrue(title.contains("https://app.indhi.io"));  
		  }
	 
	
	}

