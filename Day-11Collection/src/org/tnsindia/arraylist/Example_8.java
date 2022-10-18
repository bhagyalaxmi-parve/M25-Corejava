package org.tnsindia.arraylist;

import java.util.ArrayList;

public class Example_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> al = new ArrayList<String>();
		 al.add("JAVA");
		 al.add("C++");
		 al.add("PERL");
		 al.add("PHP");
		 System.out.println(al);
		 System.out.println(al.get(1));
		 System.out.println(al.contains("JAVA"));
		 al.add(2,"PLAY");
		 System.out.println(al);
		 System.out.println(al.isEmpty());
		 System.out.println(al.indexOf("PERL"));
		 System.out.println(al.size());

	}

}
