package org.tnsindia.list;

import java.util.ArrayList;

public class Collection_IndexOf_And_LastIndex_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>  list = new ArrayList<String>();
		list.add("java");
		list.add("j2ee");
		list.add("jsp");
		list.add("java");
		list.add("servlet");
		list.add("java");
		list.add("struts");
		System.out.println(list);
		System.out.println(list.indexOf("java"));
		System.out.println(list.lastIndexOf("java"));

	}

}
