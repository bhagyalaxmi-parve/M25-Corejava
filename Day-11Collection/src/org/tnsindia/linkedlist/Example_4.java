package org.tnsindia.linkedlist;

import java.util.LinkedList;

public class Example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();

				list.add(10);

				list.add(20);

				list.add(30);

				list.add(40);

				System.out.println(list);

				list.add(2, 9999);

				System.out.println(list);

				LinkedList<Integer> list1 = new LinkedList<Integer>();

				list1.addFirst(111);

				list1.addFirst(222);

				list1.addFirst(333);

				System.out.println(list1);

				list.addAll(3, list1);

				System.out.println(list);

	}

}
