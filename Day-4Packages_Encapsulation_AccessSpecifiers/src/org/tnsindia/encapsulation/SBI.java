package org.tnsindia.encapsulation;

public class SBI {
	
	//achieving using
	private int pin_num ;
	
	//if any variable is declared as a private and if you want to access it into another 
	//class then use getter and setter methods

	public int getPin_num() {
		return pin_num;
	}

	public void setPin_num(int pin_num) {
		this.pin_num = pin_num;
	}
	

}
