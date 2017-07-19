package UnusedTests;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class GridTesting {
	
	WebDriver _driver;
	 String baseUrl = "http://newtours.demoaut.com/";
	 String remoteUrl="http://localhost:4444/wd/hub";
	 DesiredCapabilities desiredCapablities;
  @Test
  public void f() throws InterruptedException 
  {	
 	
		
 		try 
		{ 	
 			
 			desiredCapablities.setCapability("marionette", true);
 		  
 			 String title;
 			 _driver = new RemoteWebDriver(new URL(remoteUrl),desiredCapablities); 			
 			 Thread.sleep(5000);
			_driver.navigate().to(baseUrl);
			//HandlePopup();					
			title = _driver.getTitle(); 
		}
 		
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		
 		
 		
 		
 		
  }
  
  
  private void HandlePopup()
  {
	  WebDriverWait wait=new WebDriverWait(_driver,120000);
		 
	  wait.until(ExpectedConditions.alertIsPresent());
		if(ExpectedConditions.alertIsPresent() != null)
		{
			_driver.switchTo().alert().accept();	
		}
		
  }
  
  
  
  
  
  @BeforeTest
  public void beforeTest() 
  {
	  
	 
	   	
	
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");	
	  desiredCapablities= DesiredCapabilities.firefox();
	  desiredCapablities.setPlatform(Platform.WINDOWS);
	  desiredCapablities.setCapability("marionette", true);
		
  }

  @AfterTest
  public void afterTest() {
  }

}
