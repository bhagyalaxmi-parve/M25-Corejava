package org.tnsindia.finalkeyword;



class A
{
	//final method
	final void display()
	{
		System.out.println("Final method is inherited but not the override");

	}
}
//child class is inheriting the final method of parent class as well
class B extends A
{
	void print()
	{
		System.out.println("Child class");

	}
}

public class DemoOn_FinalMethod_Inherited {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		B b=new B();
		b.display();
		b.print();

	}

}
