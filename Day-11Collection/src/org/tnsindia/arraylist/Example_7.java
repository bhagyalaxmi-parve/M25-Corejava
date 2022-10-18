package org.tnsindia.arraylist;

import java.util.ArrayList;

public class Example_7 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al= new ArrayList();
		 Object cloneList; 
		 al.add("Technology");
		 al.add("Java");
		 al.add("Arrays");
		 System.out.println(al);
		 cloneList= al.clone(); 
		 System.out.println(cloneList);

	}

}
