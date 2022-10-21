package org.tnsindia.operator;

import java.util.Scanner;

public class Relational_Operator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter first number");
	    

		
	    int a = sc.nextInt();
	    System.out.println("Enter second number");
	    
		int b = sc.nextInt();
		boolean result = a > b ;
		
		System.out.println("Result is = "+result);
		boolean res = a == b ;
		System.out.println("Result is = "+res);
		//assignment operator
		a*=b;//a=a*b;
		System.out.println("Mulltiplication is = "+a);
		

	}

}
