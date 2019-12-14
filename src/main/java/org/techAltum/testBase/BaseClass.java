package org.techAltum.testBase;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.techAltum.enums.Browser;
import org.techAltum.enums.OS;
import org.techAltum.helper.PropertyReader;

public class BaseClass {

	public WebDriver driver;
	public PropertyReader propertyReader;
	
	public WebDriver chooseBrowser(String broswerName) throws Exception{
		String OperatingSystem = System.getProperty("os.name");
		String browserDriversPath = System.getProperty("user.dir") + "/browserDrivers";
		propertyReader = new PropertyReader();
		Properties properties = propertyReader.readFromPropertyFile();
		
		//if(OperatingSystem.toLowerCase().contains("window")) {
		if(OperatingSystem.toLowerCase().contains(OS.WINDOWS.name().toLowerCase())) {
			
			//if(broswerName.toLowerCase().equals("chrome")) {
			if(broswerName.toLowerCase().equalsIgnoreCase(Browser.CHROME.name())) {
				
				System.setProperty("webdriver.chrome.driver", browserDriversPath + "/chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			else if(browserDriversPath.toLowerCase().equals("chrome")) {
				
				System.setProperty("webdfriver.gecko.driver", browserDriversPath + "/geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}
		else if(OperatingSystem.toLowerCase().contains("linux")) {
			
		}
		else if(OperatingSystem.toLowerCase().contains("mac")){
			
		}
		driver.manage().window().maximize();
		//driver.get(propertyReader.readFromPropertyFile().getProperty("URL"));
		driver. get(properties.getProperty("URL"));
		return driver;
	}
}
