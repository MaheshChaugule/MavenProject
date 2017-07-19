package test.java;
import org.testng.annotations.Test;
import Framework.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	
	 WebDriver driver;
	 
  @Test
  public void Login() throws InterruptedException 
  {	    	
      
	  LoginPage loginPageobj=new LoginPage(driver);
	  loginPageobj.LoginToPortal("vms\\mchaugul","unlock@22");
      Thread.sleep(10000);
  
  }
  
  @BeforeMethod
  public void beforeMethod()  
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium-Drivers\\chromedriver.exe");
	   driver=new ChromeDriver();	 
       driver.navigate().to("https://puvaefcqms03:55051/Portal/Account/Login?ReturnUrl=%2fPortal");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }

}
