package org.tnsindia.enumdemo;

public enum Meal {

	
	
	
	BREAKFAST(4), LUNCH(7),DINNER(10);
	
	private int value;


	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}
	
	//constructor
	private Meal(int value) {
		this.value = value;
	}



	
	
}
