package org.tnsindia.generics;

//Generics method example
public class Generics_Method_Example {
	public static <E> void printArray(E[] element)
	{
		for(E itr:element)
		{
			
			
			System.out.println(itr.getClass().getName());
			System.out.println(itr);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer[] a1 = {10,33,24,30,40};
		System.out.println("Printing Array for Integer");
		printArray(a1);
		Character[] c1 = {'A', 'B', 'C','D'};
		System.out.println("Printing Array for Character");
		printArray(c1);

	}

}
