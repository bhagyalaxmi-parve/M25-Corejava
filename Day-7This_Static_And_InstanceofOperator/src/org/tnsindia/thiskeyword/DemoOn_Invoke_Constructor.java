package org.tnsindia.thiskeyword;


//4.this keyword is invoking the current class constructor

class D
{
	//default constructor
	D()
	{
		//this keyword is invoking the current class constructor
		this(5);
		System.out.println("Default Constructor");
	}
	//Parameterized constructor
	D(int i)
	{
		System.out.println("Parameterized Constructor");
	}
	
}
public class DemoOn_Invoke_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation
				@SuppressWarnings("unused")
				D c=new D();

	}

}
