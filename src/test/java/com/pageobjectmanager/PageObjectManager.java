package com.pageobjectmanager;

import com.pageobjectmodel.LoginPageObjectModel;
import com.utility.FileReaderManager;

public class PageObjectManager {
	
	private static PageObjectManager pageObjectManager;
	private LoginPageObjectModel login;
	private FileReaderManager fileReaderManager;
	
	public static PageObjectManager getPageObjectManager() {
		if(pageObjectManager == null) {
			pageObjectManager = new PageObjectManager();
		}
		return pageObjectManager;
	}
	public LoginPageObjectModel getLogin() {
		if(login == null) {
			login = new LoginPageObjectModel();
		}
		return login;
	}
	public FileReaderManager getFileReaderManager() {
		
		if(fileReaderManager == null) {
			fileReaderManager = new FileReaderManager();
		}
		return fileReaderManager;
	}
	
	

	
	
	

}
