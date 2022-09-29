package org.tnsindia.encapsulation;

public class Demo_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SBI s = new SBI();
		
		//setting the values using setters method
		s.setPin_num(10780);
		//returning the output using getters method
		System.out.println("pin of atm is = "+s.getPin_num());
	}

}
