package org.tnsindia.annotations;

import java.util.Scanner;


//Demo on  SupressWArning  Annotation(built-in java annotation)
public class Supress_Warning_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		//this annotation is used to remove the warnings which occurred at the compile time
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		System.out.println(x);
		

	}

}
