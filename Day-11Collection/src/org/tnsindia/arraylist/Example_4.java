package org.tnsindia.arraylist;

import java.util.ArrayList;


//How do retrieve an element from a particular position 
//of an ArrayList?
public class Example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> list = new 
				ArrayList<Integer>();
				 list.add(111);
				 list.add(222);
				 list.add(333);
				 list.add(444);
				 System.out.println(list); 
				 System.out.println(list.get(3)); 
				 System.out.println(list.get(1));

	}

}
