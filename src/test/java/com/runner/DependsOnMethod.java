package com.runner;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
 @Test()
 private void login() {
	// Assert.fail();
	 System.out.println("login");
	
}
 @Test(dependsOnMethods = "login")
 private void productsearch() {
	 
	 System.out.println("productsearch");
 }
 
 @Test(dependsOnMethods = "productsearch")
 private void addtocart() {
	 
	 System.out.println("addtocart");
 }
 
}
