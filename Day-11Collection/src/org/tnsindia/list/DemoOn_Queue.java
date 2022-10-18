package org.tnsindia.list;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoOn_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//queue is a interface we can't create the object for it
		Queue<Character> list = new PriorityQueue<>();
		list.add('z');
		list.offer('a');
		list.offer('s');
		list.offer('p');
		System.out.println(list);
		
		list.remove();
		
		System.out.println(list);
		list.remove();
		System.out.println(list);
		

	}

}
