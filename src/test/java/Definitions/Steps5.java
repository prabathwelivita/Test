package Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.Homepage_PF;
import PageFactory.LoginPage_PF;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps5 {
	WebDriver driver = null;
	LoginPage_PF login_page;
	Homepage_PF home_page;

	@Given("browser is open")
	public void browser_is_open() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@And("User is on login page")
	public void user_is_on_login_page() {

		driver.get("https://practicetestautomation.com/practice-test-login/");

	}

	@When("^User enteres (.*) and (.*)$")
	public void user_enteres_username_and_password(String Username, String Password) {

		login_page = new LoginPage_PF(driver);
		login_page.enterUsername(Username);
		login_page.enterOassword(Password);

		// driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(Username);
		// driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password );

	}

	@And("user user clicks on login")
	public void user_user_clicks_on_login() {

		login_page.clickOnLogin();

		// driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		home_page = new Homepage_PF(driver);
		home_page.logout_btnDisplay();

	}

}
