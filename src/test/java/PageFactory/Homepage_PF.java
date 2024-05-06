package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_PF {
	
	@FindBy(xpath = "//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")
	@CacheLookup
	WebElement btn_logout;
	
	WebDriver driver;
	
	
	public Homepage_PF(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, Homepage_PF.class);
	}
	
	
	public void logout_btnDisplay()
	{
		System.out.println("btn_logout.isEnabled()");
		
	}

}
