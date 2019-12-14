package org.techAltum.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {
	
	public Properties readFromPropertyFile() throws Exception{
	
		String PropFileilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\data.properties";
		File file = new File(PropFileilePath);
		FileInputStream fileInputStream = new FileInputStream(file);
		
		Properties properties = new Properties();
		properties.load(fileInputStream);
		
		//return prop.getProperty(key);
		return properties;
	}
}
