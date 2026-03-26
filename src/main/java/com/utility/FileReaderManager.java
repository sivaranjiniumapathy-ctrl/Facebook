package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class FileReaderManager {

	private static FileInputStream fileInputStream;
    private static Properties properties;
    
    public static void setproperties() throws IOException {
		File file = new File("C:\\Users\\AC\\eclipse-workspace\\Facebook\\src\\main\\resources\\Testdata.properties");

    	try {
			fileInputStream = new FileInputStream(file);//allow
			 properties = new Properties();
			 properties.load(fileInputStream);//access
			
			
		} catch (FileNotFoundException e) {
			Assert.fail("ERROR OCCUR DURING FILE LOADING");
		}catch (Exception e) {
			Assert.fail("ERROR OCCUR DURING FilE ACCESS");
		}
    	  }
    
    public static String getfiledataproperty(String datavalue) throws IOException {
    	
    	setproperties();
    	String data = properties.getProperty(datavalue);
		return data;
		
	}
}
