package org.tnsindia.datatype;

import java.util.Scanner;

public class IntegerUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int no ;
		System.out.println("Enter number");
        no = sc.nextInt();
        System.out.println("number is = " +no);
		
	}

}
