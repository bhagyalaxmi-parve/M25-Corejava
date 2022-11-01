package org.tnsindia.junit5demo;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


@TestInstance(Lifecycle.PER_CLASS)
  interface  LifeCycleMethod_Demo {

	@Test
	default void display()
	{
		System.out.println("M25 Batcj");
	}
	
	
	
	@BeforeAll
	@Test
	default void print1() {
		System.out.println("BeforeAll annotation executed before all the testcases");
	}
	
	
	
	@BeforeEach
	@Test
	default void print2() {
		System.out.println("BeforeEach annotation executed before each  testcases");
	}


	@AfterEach
	@Test
	default void accept1() {
		System.out.println("AfterEach annotation executed after each  testcases");
	}
	
	
	
	

	@AfterAll
	@Test
	default void accept2() {
		System.out.println("AfterAll annotation executed after all the testcases");
	}
}

