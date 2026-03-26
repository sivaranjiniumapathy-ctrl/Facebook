package com.runner;

import java.io.IOException;

import org.junit.Before;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

public class Facebookrunner extends BaseClass {
//@BeforeTest	
//private void setupproperty() throws IOException {
//	launchbrowser(PageObjectManager.getPageObjectManager().getFileReaderManager().getfiledataproperty("browser"));
//	launchurl(PageObjectManager.getPageObjectManager().getFileReaderManager().getfiledataproperty("url"));
//}
// @AfterTest(enabled=true)
//private void Browsertermination() {
//	quit();
//}
	
	
 @Test()
 private void apple() throws InterruptedException {
	 System.out.println("method 1");
 }
 
 @Test()
 private void banana() throws InterruptedException {
System.out.println("method 2");
 }
 
 @Test()
 private void grapes() throws InterruptedException {
System.out.println("method 3");
 }
 
}
