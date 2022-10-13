package org.tnsindia.exception;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsException {
	
	public static void print(int x)throws IOException, ClassNotFoundException
	{
		if(x==1) {
			throw new IOException("IOException Occured");
		}
		else {
			throw new ClassNotFoundException("Class not Found Exception");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the input for x: ");
			int x=s.nextInt();
			print(x);
			s.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
