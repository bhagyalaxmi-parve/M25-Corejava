package org.tnsindia.interfaceexample;

import java.util.Scanner;

//child class to implement the method of interface


public class Shape_Area implements Area{

	@Override
	public void circle() {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the radius of circle");
	  double radius = sc.nextDouble();
	  System.out.println("the area of circle is = "+3.142*radius*radius);
		
	}

	@Override
	public void square() {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the sides of square");
		  double side = sc.nextDouble();
		  System.out.println("the area of square is = "+side*side);
			
		
	}
	
	

}
