package org.techAltum.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ZaiperHomePage {

	WebDriver driver;
	
	public ZaiperHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Click on login button on home page
	@FindBy(how = How.XPATH, using = "//span[text()='Log In']")
	public WebElement loginButton;
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	//Click on Signup on home page
	@FindBy(how = How.CSS, using = "a[data-content='Sign Up']")
	public WebElement signupButton;
	public void clickOnSignupButton() {
		signupButton.click();
	}
}
