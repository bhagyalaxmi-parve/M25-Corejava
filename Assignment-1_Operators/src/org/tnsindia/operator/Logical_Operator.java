package org.tnsindia.operator;

import java.util.Scanner;

public class Logical_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter first number");
	    

		
	    int a = sc.nextInt();

	    System.out.println("Enter second number");
	    
	    
	    
		int b = sc.nextInt();
		boolean result = (a>b && b<a);
		  System.out.println(result);
		
	}

}
