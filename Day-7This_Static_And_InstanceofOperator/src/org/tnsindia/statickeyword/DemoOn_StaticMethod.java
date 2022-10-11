package org.tnsindia.statickeyword;

//Static keyword with Method
class A
{
	//non -static method
	int add(int a,int b)
	{
		return a+b;
	}
	//static method
	public static void display()
	{
		System.out.println("Welcome to Java Full stack training");
	}
}


public class DemoOn_StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*without creating any object for a class we can access that method by making
		that method as static
		className.methodname();*/
		
		A.display();

	}

}
