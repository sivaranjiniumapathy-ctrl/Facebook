package com.runner;

import org.testng.annotations.Test;

public class Grouping {
   @Test(groups ="flower" )
	private void sunflower() {
		System.out.println("sunflower");
		
	}
	@Test(groups = "flower")
	private void rose() {
		System.out.println("rose");
		
	}
	@Test(groups = "fruits")
	private void mango() {
		System.out.println("mango");
		
	}
	@Test(groups="fruit")
	private void grape() {
		System.out.println("grape");
		
	}
}
