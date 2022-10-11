

package org.tnsindia.overloading;



//method overloading by passing the diff. datatypes

class MathematicalOperation{
	
	//method overloading
	public void  addition(int a, int b)
	{
		System.out.println("addition is = "+(a+b));
	}
	
	
	public void  addition(float a, float b)
	{
		System.out.println("addition is = "+(a+b));
	}
}
public class MethodOverloading_By_ChangingDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MathematicalOperation mp = new  MathematicalOperation();
		 mp.addition(12, 12);
		 mp.addition(12.0f, 33);
	}

}
