package com.base;



import javax.lang.model.element.Element;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public abstract class BaseClass {
	public static WebDriver driver;
	protected static void launchbrowser(String browsername) {
		try {
			if(browsername.equalsIgnoreCase("chrome")) {
				driver= new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("firefox")) {
				driver= new FirefoxDriver();
			}
			
			else if (browsername.equalsIgnoreCase("safari")) {
				driver= new SafariDriver();
			}
			else if (browsername.equalsIgnoreCase("edge")) {
				driver= new EdgeDriver();
			}
		} catch (Exception e) {
			Assert.fail("ERROR OCCURS DURING BROWSER LAUNCH");
		}
		}
	
	protected static void launchurl(String url) {
		try {
			driver.get(url);
			
		} catch (Exception e) {
		 Assert.fail("ERROR OCCURS DURING GET URL");
		}
		
		}
	protected static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			Assert.fail("ERROR OCCURS DURING quit");
		}
		
	}
	 protected static void valuepasskeys(WebElement element,String inpuString) {
		   try {
			element.sendKeys(inpuString);
		} catch (Exception e) {
			Assert.fail("ERROR OCCURS DURING quit");
		}
		   
		 }
	 protected static void clickbutton(WebElement element )	   {
		   try {
			element.click();
		} catch (Exception e) {
			Assert.fail("ERROR OCCURS DURING click");
		}
	   } 
	 protected static void  close() {
		 
	 }
}
