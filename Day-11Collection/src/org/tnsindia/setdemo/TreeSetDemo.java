package org.tnsindia.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//SortedSet s = nObjecttedSet<>();
		SortedSet<Object> s = new TreeSet<>();
		s.add("abc");
		s.add("xyx");
		s.add("aaa");
		s.add("aaa");
		System.out.println("the elements in the set= "+s);

	}

}
