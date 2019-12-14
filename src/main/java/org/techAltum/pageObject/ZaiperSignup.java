package org.techAltum.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ZaiperSignup {

	WebDriver driver;
	public ZaiperSignup(WebDriver driver) {
		this.driver = driver;
	}

	
	@FindBy(how = How.NAME, using = "email")
	public WebElement workEmailTextBox;
	public void enterWorkEmail() {
		workEmailTextBox.sendKeys("akumar.mails121@gmail.com");
	}
}
