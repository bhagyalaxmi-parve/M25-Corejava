package org.tnsindia.lambdaexpression;

public interface Functional_Interface_Example_Executor {
	
	Functional_Interface_Example obj=(int a,int b)->
	{
		int result=(a>b)?a:b;
		
		//System.out.println("The maximum number is:" +result);
		return result;
		
	};
	System.out.println("The maximum number is:" +obj.max(34, 67));


}
