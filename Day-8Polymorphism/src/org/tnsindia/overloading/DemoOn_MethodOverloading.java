package org.tnsindia.overloading;


//demo on method overloading by changing the no.of arguments

class Shape{
	
	
	//method overloading
	//zero arguments
	public void area()
	{
		System.out.println("Find Area");
	}
	
	//method overloading
		//one arguments
	public void area(int r)
	{
		System.out.println(" Area of circle= "+(3.14*r*r*r));
	
	
	}
	//method overloading
		//two arguments
	public void area(int l, int b)
	{
		System.out.println(" Area of rectangle= "+(l*b));
	}

}



//for method overloading child class is not required
//without using inheritance you can perform method overloading


public class DemoOn_MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Shape s = new Shape();
		s.area();
		s.area(5);
		s.area(2, 3);


	}

}
