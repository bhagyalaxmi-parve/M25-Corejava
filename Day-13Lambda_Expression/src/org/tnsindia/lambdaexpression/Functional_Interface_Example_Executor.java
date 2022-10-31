package org.tnsindia.lambdaexpression;

//lambda expression with return type
public interface Functional_Interface_Example_Executor {
	public static void main(String args[])
	{
		

	
	Functional_Interface_Example obj =(int a,int b)->
	{

		int result = (a>b)?a:b;
		//System.out.println("The maximum no. is: "+result);
		return result;
	};
	
	System.out.println("The maximum no. is: " +obj.max(34,67));
}
}
