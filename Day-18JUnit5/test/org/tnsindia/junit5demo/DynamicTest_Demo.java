package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;

import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

class DynamicTest_Demo {


	//dynamic test
	@TestFactory
	Collection<DynamicTest>print()
	{
		return Arrays.asList(dynamicTest("simple dynamic test",()->assertTrue(true)),
				dynamicTest("my executable class", new MyExecutableDynamicTestDemo()));
	}
}
class MyExecutableDynamicTestDemo implements Executable{

	@Override
	public void execute() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("welcome to m25 batch");
		
	}
	
}