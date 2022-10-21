package org.tnsindia.enumdemo;

public class Ticket_Category_Demo {
	
	
	public enum TicketCategory{
		AC,
		SLEEPER,
		GENERAL

		
	}
	
	private String description;

      Ticket_Category_Demo(String description) {
		//super();
		this.description = description;
	}

      //getters and setters to access private variables
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
