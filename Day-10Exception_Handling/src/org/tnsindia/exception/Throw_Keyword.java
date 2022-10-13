package org.tnsindia.exception;

public class Throw_Keyword {

	
	public static void display(int age, int weight)
	{
		
		if(age>18  && weight>45)
		{
			System.out.println("Eligible to donote blood");
	}
		else
		{
			throw new ArithmeticException("not eligible");
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			display(20, 30);
		}
		catch(ArithmeticException  e)
		{
			System.out.println(e);
		}

	}

}
