package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collection;



//demo on collection interface
public class DemoOn_Collection_Interface {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection obj = new ArrayList<>();
		
		//adding the values
		obj.add("bhagyalaxmi");
		obj.add('x');
		obj.add(12.5f);
		System.out.println("ELEMENTS ARE= "+obj);
		
		

	}

}
