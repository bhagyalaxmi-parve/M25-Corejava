package org.tnsindia.list;

import java.util.Stack;

public class DemoOn_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		s.pop();
		s.remove(2);
		System.out.println(s);
		
	}

}
