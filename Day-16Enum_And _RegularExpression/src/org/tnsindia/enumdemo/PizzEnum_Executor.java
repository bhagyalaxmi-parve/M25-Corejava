package org.tnsindia.enumdemo;

import java.util.Scanner;

import org.tnsindia.enumdemo.PizzaEnum_Demo.Size;

public class PizzEnum_Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pizza");
		String size = sc.nextLine();
		
		
		//CONVERTING STRING TO ENUM -SIZE OF THE PIZZA
		Size s1  = Size.valueOf(size.toUpperCase());
		switch(s1)
		{
		   case SMALL:   System.out.println("preparing small piza for the customer");
			            break;
		 
		 
		   case LARGE:     System.out.println("Preparing large piza for the customer");
                         break;
		 
		    case EXTRALARGE:System.out.println("Preparing extralarge piza for the customer");
                        break;
		 
		 
		 
		 case MEDIUM:  System.out.println("Preparing medium piza for the customer");
                         break;
                         
			
		}

	}

}
