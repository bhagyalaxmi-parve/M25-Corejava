

package org.tnsindia.setdemo;


import java.util.LinkedHashSet;
import java.util.Set;

public class DemoOn_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Object> s = new  LinkedHashSet<>();
        s.add("bhagyalaxmi");
        s.add('b');
        s.add(34.7f);
        s.add("bhagyalaxmi");
        s.add(null);
        s.add(null);
        for(Object itr : s)
        {
        	System.out.println(itr);
        }
        System.out.println("the elements in the set= "+s);

	}

}
