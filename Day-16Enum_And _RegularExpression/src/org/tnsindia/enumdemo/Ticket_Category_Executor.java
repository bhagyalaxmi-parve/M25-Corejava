package org.tnsindia.enumdemo;

import org.tnsindia.enumdemo.Ticket_Category_Demo.TicketCategory;

public class Ticket_Category_Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TicketCategory t = TicketCategory.SLEEPER;
		if(TicketCategory.SLEEPER==t)
		{
			System.out.println("this is a sleeper class");
		}
		else {
			System.out.println("this is not a sleeper class");
		}

	}

}
