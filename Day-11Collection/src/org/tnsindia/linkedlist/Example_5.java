


package org.tnsindia.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Example_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();

				list.add("Jio");

				list.add("Airtel");

				list.add("BSNL");

				list.add("Vodafone");

				System.out.println(list);

				Iterator<String> it =  list.descendingIterator();

				while (it.hasNext())

				{

				System.out.println(it.next());
				}

	}

}
