package org.tnsindia.vector;

import java.util.ArrayList;
import java.util.Vector;

public class Example_4 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arr = new ArrayList<>();

		arr.add(3);

		arr.add("Methods");

		arr.add("Java");

		arr.add(4);

		Vector v = new Vector();

		v.addAll(arr);

		System.out.println(v);

	}

}
