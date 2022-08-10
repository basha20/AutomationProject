package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumutilities.SeleniumWebElements;

public class HomePage extends SeleniumWebElements{
	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='New Customer']")
	private WebElement newCustomerLnk;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(this.driver, this);
	}
	
	public HomePage clickNewCustomerLink() throws Exception {
		clikOnElement(newCustomerLnk);
		return this;	
	}

}
