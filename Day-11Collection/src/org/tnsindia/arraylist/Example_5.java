package org.tnsindia.arraylist;

import java.util.ArrayList;

//How do replace a particular element in an ArrayList 
	//with the given element?
public class Example_5 {


	 public static void main(String[] args)
	 {
	 ArrayList<Integer> list = new 
	ArrayList<Integer>();
	 list.add(2654);
	 list.add(362);
	 list.add(247);
	 list.add(326);
	 System.out.println(list); 
	 list.set(1, 000);
	 list.set(3, 000);
	 System.out.println(list);
	}

}
