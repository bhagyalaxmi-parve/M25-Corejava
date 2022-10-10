package org.tnsindia.wrapperclasses;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//conversion of primitive datatypes to its corresponding wrapper class object
		char ch='z';
		
		//auto boxing
		Character c = ch;
		Character c1 = new Character('x');
		System.out.println(ch+ " "+c+ " "+c1);

	}

}
