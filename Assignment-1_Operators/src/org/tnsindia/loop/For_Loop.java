package org.tnsindia.loop;

import java.util.Scanner;

public class For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int n = sc.nextInt();
		
		for(int i=0; i<=n;i++)
		{
			System.out.println(i);
		}
	}

}
