package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceelements.Logininterface;

public class LoginPageObjectModel extends BaseClass implements Logininterface {
	
	@FindBy (xpath= email_xpath)
	WebElement email;
	
	@FindBy(xpath= password_xpath)
	WebElement password;
	
	@FindBy(xpath= login_xpath)
	WebElement login;
	
 public LoginPageObjectModel() {
	 PageFactory.initElements(driver, this);
 }

 public void facebooklogin() throws InterruptedException {
	 valuepasskeys(email, "sivaranjiniumapathy@gmail.com");
	 valuepasskeys(password, "umapathy@12345"); 
	 clickbutton(login);
	 Thread.sleep(5000);
 }
 
 
}
