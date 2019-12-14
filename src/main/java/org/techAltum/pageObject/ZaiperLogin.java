package org.techAltum.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ZaiperLogin {

	private WebDriver driver;
	public ZaiperLogin(WebDriver driver) {
		this.setDriver(driver);
		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, ZaiperHomePage.class);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.NAME, using = "email")
	public WebElement  emailTextbox;
	public void enterEmail() {
		emailTextbox.sendKeys("amit.kumar.tech@fareportal.com");
	}
	
	@FindBy(how = How.CSS, using = "div[class='login-form'] a div")
	public WebElement  continueWithGoogleButton;
	public void continueWithGoogle() {
		continueWithGoogleButton.click();
	}
	
	@FindBy(how = How.CSS, using = "div[class='login-form'] a div")
	public WebElement  continueWithFacebookButton;
	public void continueWithFacebook() {
		continueWithFacebookButton.click();
	}
	
	
}
