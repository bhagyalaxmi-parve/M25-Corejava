
package org.tnsindia.setdemo;

import java.util.HashSet;
import java.util.Set;

public class DemoOn_HashSet {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             //Set s = new  Set<>();
             @SuppressWarnings("rawtypes")
			Set s = new  HashSet<>();
             s.add("bhagyalax;mi");
             s.add('b');
             s.add(34.7f);
             s.add("bhagyalaxmi");
             s.add(null);
             s.add(null);
             System.out.println("the elements in the set " +s);
             		
	}

}
