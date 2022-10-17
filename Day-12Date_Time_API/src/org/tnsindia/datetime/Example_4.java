package org.tnsindia.datetime;

import java.time.Clock;

public class Example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		Clock c = Clock.systemUTC();
		Clock c1 = Clock.systemDefaultZone();
		System.out.println(c1);

	}

}
