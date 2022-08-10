package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumutilities.SeleniumWebElements;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(name =  "uid")
	private WebElement emailTxt;
	
	@FindBy(name =  "password")
	private WebElement passwordTxt;
	
	@FindBy(xpath = "//input[@value='LOGIN']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(this.driver, this);
	}
	
	public void loginToApp(String userName, String password) throws Exception {
		SeleniumWebElements.enterInputIntoElement(emailTxt, userName);
		SeleniumWebElements.enterInputIntoElement(passwordTxt, password);
		SeleniumWebElements.clikOnElement(loginBtn);
	}

}
