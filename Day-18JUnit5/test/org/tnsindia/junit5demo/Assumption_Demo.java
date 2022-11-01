package org.tnsindia.junit5demo;



import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class Assumption_Demo {

	@Test
	void display() {
		System.setProperty("shubhangi" ,"Par");
		
		Assumptions.assumeTrue("Par".equals(System.getProperty("shubhangi")));
	}
	
	@Test
	void display1() {
		System.setProperty("shubhangi" ,"Par");
		
		Assumptions.assumeFalse("Par".equals(System.getProperty("shubhangi")));
	}
	
	

	

}
