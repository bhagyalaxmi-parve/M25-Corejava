package org.tnsindia.lambdaexpression;

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//lambda expression without return type
				
		
		
		MaxFinder_Demo obj=(a,b)->a>b?a:b;
		
				System.out.println("The maximum no.is: " +obj.max(25, 6));

	}

}
