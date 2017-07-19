package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
	WebDriver _driver;
	
	public LoginPage(WebDriver driver)
	{
		_driver=driver;
		
	}
	
	
	public void LoginToPortal(String name,String pass)
	{
		setUserName(name);
	    setPassWord(pass);
	    getLoginButton().click();
	}
	
	public void setUserName(String name)
	{
		 WebElement userNametxtbox=  _driver.findElement(By.id("UserId"));
		  userNametxtbox.clear();
		  userNametxtbox.sendKeys(name);
	}
	
	public void setPassWord(String password)
	{
		 WebElement passWordTxtbox=_driver.findElement(By.id("Password"));
		   
	     passWordTxtbox.clear();
	     passWordTxtbox.sendKeys(password); 
	}
	
	public WebElement getLoginButton()
	{
		return _driver.findElement(By.id("btnLogin"));
	}
	
	
	
	
	
}
