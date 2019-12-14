package org.techAltum.testRunner;

import org.techAltum.helper.PropertyReader;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberFeatureWrapper;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleEventWrapper;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions(
		features = "src/test/resources/features/",
		glue = {"org.techAltum.stepsDefinition"},
		plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/cucumber-reports/rerun.txt"},
		//format = {"pretty", "html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/cucumber-reports/rerun.txt"}
		dryRun = false,
		tags = {"@Regression", "@CucumberHooks"},
		strict = true,
		monochrome = true
		) 
 
public class TestRunner {

	//public PropertyReader propertyReader;
	private TestNGCucumberRunner testNGCucumberRunner;
	  
	@BeforeClass(alwaysRun = true) 
	public void setupClass() throws Exception{
		//propertyReader = new PropertyReader();
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass()); 
	}	
	  
	@Test(groups = "cucumber", description = "Cucumber Tests", dataProvider = "features") 
	public void feature(PickleEventWrapper eventWrapper, CucumberFeatureWrapper cucumberFeature) throws Exception{
		//testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		try {
			testNGCucumberRunner.runScenario(eventWrapper.getPickleEvent());
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	  
	  
	@DataProvider public Object[][] features() { 
		//return  testNGCucumberRunner.provideFeatures();
		return  testNGCucumberRunner.provideScenarios();
	}
	  
	  
	@AfterClass(alwaysRun = true) public void testDownClass() {
		testNGCucumberRunner.finish(); }
	 
}
