package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class First_JUnitTest {

	@Test
	
	//it will perform the testing on the method
	void test() {
		System.out.println("Hello....");
	}
	
	
	@Test
	@Disabled
	void display() {
		
		
		fail("hi");
		//System.out.println("Hello....");
	}
	

}
