package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogiPage {
	
	WebDriver driver;
	
	By txt_username = By.id("username");
	By txt_password = By.id("password");
    By btn_login =  By.id("submit");
    
    By btn_logout  = By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a");
    public LogiPage(WebDriver driver)
    {
    	this. driver = driver;
    }
	 		
			
			
		public  void  user_name(String username)
		{
			 driver.findElement(txt_username).sendKeys(username);
			
			
			
		}
		
		public void  User_password(String Password)
		{
			 driver.findElement(  txt_password ).sendKeys(Password);;
			
			
		}
		
		public void User_loginbtn()
		{
			 driver.findElement(   btn_login ).click();
			
			
		}
		
		public void Validate()
		{
			driver.findElement(btn_logout).isDisplayed();
		}
		
		
		
		
	}


