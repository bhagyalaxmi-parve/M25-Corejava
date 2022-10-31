package org.tnsindia.array;

import java.util.Scanner;

public class Array_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		
		//Array declaration
		int arr[]=new int[size];
		System.out.println("Enter the values: ");
		
		
		//to enter the elements in the array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("\nEnter the "+i+" index");
			arr[i]=s.nextInt();
		}
		//to print the elements in the array
		System.out.println("Array elements are = ");
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
		}
		
		
		//enhanced for loop
//		for(int j:arr)
//		{
//			System.out.println(j);
//		}

	}

}
