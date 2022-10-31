package org.tnsindia.lambdaexpression;

public class MaxFinder_Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		MaxFinderChild_Demo d = new MaxFinderChild_Demo();
//		d.max(90, 55);
		
		
		//lambda expression
		/*MaxFinder_Demo obj = (int a, int b)->
		{
			int result = (a>b)?a:b;
			System.out.println("The maximum no. is: "+result);
			
		};
		obj.max(50,99);*/
		
		
		
		
		//lambda expression without return type
		MaxFinder_Demo obj = (a,b)->a>b?a:b;
		System.out.println("The maximum no. is: " +obj.max(25, 61));

	}

}
