package org.tnsindia.dicisionmaking;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter choice");
		int ch =sc.nextInt();
		
		switch(ch)
		{
		case 1: System.out.println("HIII....");
		        break;
		        
		case 2: System.out.println("HELLO...");
        break;
        
        
		case 3: System.out.println("WELCOME.....");
                break;
		        
        default : System.out.println("Invalid choice");
		}
		
		



	}

}
