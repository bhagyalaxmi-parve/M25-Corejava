package org.tnsindia.lambdaexpression;


//functional interface
//functional interface contains exactly one abstract method
public interface MaxFinder_Demo {
	//bydefault=public abstract method
	
	//abstract method
     //void max(int a, int b);
   int max(int a, int b);
	
}


//1.first way to implement functional interface by using child class
 class MaxFinderChild_Demo implements  MaxFinder_Demo{
	 /*we have implemented functional interface by using child class but here the length of the
	  code is increased, so we have another way that is lambda expression*/
	 
	 
	public void max(int a, int b) {
		int result=(a>b)?a:b;
		System.out.println("The maximum number is=" +result);
	}
}



//2. implement functional interface by using Lambda Expression


