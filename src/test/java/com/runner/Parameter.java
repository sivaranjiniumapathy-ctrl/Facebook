package com.runner;

import org.junit.Test;
import org.testng.annotations.Parameters;

public class Parameter {
@Test
@Parameters("browser")
	private void launchbrowser(String browser) {
		
		System.out.println(browser);
	}
}
