package org.tnsindia.lambdaexpression;

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lambda Expression
	MaxFinder_Demo obj=(a, b)->
				{
					int result=(a>b)?a:b;
					
					System.out.println("The maximum number is:" +result);
					return a;
				
				};
				obj.max(13, 98);


	}

}
