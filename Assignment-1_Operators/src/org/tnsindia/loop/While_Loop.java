package org.tnsindia.loop;

import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int n = sc.nextInt();
		int i = 0;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}

	}

}
