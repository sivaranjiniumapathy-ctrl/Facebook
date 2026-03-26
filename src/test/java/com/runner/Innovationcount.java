package com.runner;

import org.testng.annotations.Test;

public class Innovationcount {

	@Test(invocationCount = 3)
	private void login() {
		System.out.println("login");
		
	}
}
