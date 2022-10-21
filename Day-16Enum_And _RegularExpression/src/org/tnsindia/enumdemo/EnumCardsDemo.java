package org.tnsindia.enumdemo;

public enum EnumCardsDemo implements InterfaceCardsDemo {
	
	
	
	//we can implement interface using enum
	HEART, CLUB, DIAMOND, SPADES;
	
	public void print() {
		
		
		System.out.println("slected shape in the cards are = "+this);
	}

}
