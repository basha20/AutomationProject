package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.BaseTest;
import Pages.LoginPage;
import dataDrivers.readPropertiesfile;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	LoginPage loginPage;

	@Given("Open application url")
	public void open_application_url() throws Exception {
	BaseTest.lauchBrowser("Chrome", readPropertiesfile.readData("URL"));
	}

	@When("Enter user name and password")
	public void enter_user_name_and_password() throws Exception {
		LoginPage loginpage = new LoginPage(BaseTest.getDriver());
		loginpage.loginToApp(readPropertiesfile.readData("UserId"), readPropertiesfile.readData("Password"));
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		System.out.println("click login button");
	}

	@Then("User can able to verify home page")
	public void user_can_able_to_verify_home_page() {
		System.out.println("Home page displayed");
	}
	
	
	@Given("This background")
	public void this_background() {
		System.out.println("Before Scenario");
	}
	
	@When("Enter user name {string} and password {string}")
	public void enter_user_name_and_password(String userName, String Password) throws Exception {
		loginPage = new LoginPage(BaseTest.getDriver());
		loginPage.loginToApp(readPropertiesfile.readData(userName), readPropertiesfile.readData(userName));
	}
	
	@Then("Close the brower")
	public void close_the_brower() {
		BaseTest.getDriver().quit();
	}


}
