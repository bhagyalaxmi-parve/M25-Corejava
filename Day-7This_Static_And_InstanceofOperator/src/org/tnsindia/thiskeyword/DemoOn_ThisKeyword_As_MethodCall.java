package org.tnsindia.thiskeyword;

//3.this can be passes as an argument in the method call
class C
{
	
	public void display(C c)
	{
		System.out.println("Display function invoked");
	}
	//user-defined-method
	public void print()
	{
		display(this);
	}
}

public class DemoOn_ThisKeyword_As_MethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c=new C();
		c.print();
	}

}
