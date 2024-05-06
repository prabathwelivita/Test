//package Definitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import Pages.LogiPage;
//import io.cucumber.java.en.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Steps {
//	WebDriver driver = null;
//	LogiPage  loginpage;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//
//	}
//
//	@And("User is on login page")
//	public void user_is_on_login_page() {
//
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//
//	}
//
//	@When("^User enteres (.*) and (.*)$")
//	public void user_enteres_username_and_password(String Username ,String Password ) {
//		 loginpage = new LogiPage(driver);
//		loginpage.user_name(Username);
//		loginpage.User_password(Password);
//	}
//
//	@And("user user clicks on login")
//	public void user_user_clicks_on_login() {
//
//		loginpage.User_loginbtn();
//
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//
//		loginpage.Validate();
//
//	}
//
//}
