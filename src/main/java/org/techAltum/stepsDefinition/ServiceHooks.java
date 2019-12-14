package org.techAltum.stepsDefinition;

import org.techAltum.enums.Browser;
import org.techAltum.testBase.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class ServiceHooks {

	BaseClass baseClass;
	//private WebDriver driver;
	
	@Before
	public void initializeTest(Scenario scenario) throws Exception {
		System.out.println("Execution scenario = " + scenario.getName());
		baseClass = new BaseClass();
		baseClass.chooseBrowser(Browser.CHROME.name());
	}
	
	@After
	public void endTest(Scenario scenario) throws Exception{
		baseClass.driver.quit();
	}
}
