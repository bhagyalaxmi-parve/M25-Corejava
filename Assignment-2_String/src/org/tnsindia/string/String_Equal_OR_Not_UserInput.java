package org.tnsindia.string;

import java.util.Scanner;

public class String_Equal_OR_Not_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="bhagyalaxmi";
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		if(str1.equals(str))
		{
			System.out.println("Matching");
			
		}
		else
		{
			System.out.println("Not Matching");
		}

	}

}
