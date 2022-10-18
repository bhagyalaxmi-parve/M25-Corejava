package org.tnsindia.linkedlist;

import java.util.LinkedList;

public class Example_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<String> list = new LinkedList<String>();

				list.add("Rose");

				list.add("Flower");

				list.add("Water");

				list.add("Sand");

				list.add("Bottle");

				System.out.println(list);

				String s = "Flower";

				boolean contains = list.contains(s);

				if(contains){

				System.out.println(list.indexOf(s));

				}s = "Bottle";

				contains = list.contains("Bottle");

				if(contains){

				System.out.println(list.indexOf(s));
				}

	}

}
