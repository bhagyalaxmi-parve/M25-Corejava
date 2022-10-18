package org.tnsindia.vector;

import java.util.Vector;

public class Example_6 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		Vector v = new Vector();

		v.add(1);

		v.add(2);

		v.add("Animal");

		v.add("Flower");

		v.add(3);

		v.setElementAt(4, 1);

		System.out.println(v);

	}

}
