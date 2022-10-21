package org.tnsindia.enumdemo;

public class EnumCarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Car r1 = Car.TESLA;         // accessing enum  constant
//		System.out.println(r1);
//		
		
		
		//enhance for loop
		for(Car cr : Car.values())
		{
			
			System.out.println(cr);
			
			//System.out.println(cr.HONDA);
		}

	}

}
