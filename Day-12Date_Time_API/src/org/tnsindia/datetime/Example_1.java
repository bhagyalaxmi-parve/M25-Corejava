package org.tnsindia.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;



public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LocalDate d = LocalDate.now();
		LocalTime obj = LocalTime.now();
		
		
		LocalDateTime obj1 = LocalDateTime.now();
		LocalDate obj2 = LocalDate.of(2022, 2, 10);
		
		System.out.println(d);
		System.out.println(obj);
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
	

}
