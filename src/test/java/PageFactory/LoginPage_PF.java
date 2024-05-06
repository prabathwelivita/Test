package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {
	
	
	
	
	@FindBy(id ="username")
	WebElement txt_username;
	
	@FindBy(id ="password")
	WebElement txtpassword;
	@FindBy(id = "submit")
	WebElement login_btn;
	
	WebDriver driver;
	public LoginPage_PF(WebDriver driver) {
		
	this.driver=driver;
	
	PageFactory.initElements(driver,this);
	
	AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		
		
		
	}
	
	public void enterUsername(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void enterOassword(String password)
	{
		txtpassword.sendKeys(password);
	}
	public void clickOnLogin()
	{
		login_btn.click();
	}
	
	

}
