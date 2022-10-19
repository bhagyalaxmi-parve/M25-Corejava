package org.tnsindia.generics;

public class Generic_Class_Example<T> {
	T  num;
	public void display()
	{
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Generic_Class_Example<Double> g = new Generic_Class_Example<Double>();
		g.num=120.67;
		g.display();
	}

}
