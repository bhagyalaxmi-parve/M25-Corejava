package org.tnsindia.generics;


//ADVANTAGES OF GENERICS
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Advantages_Of_Generics {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		List <Integer>obj = new ArrayList<>();
		obj.add(10);
		//1) Type-Safety
		//obj.add("bhagyalaxmi");
		//obj.add(156.7f);
		System.out.println(obj);
		
		
		
		List<String> list = new LinkedList<>();
		list.add("hello");
		@SuppressWarnings("unused")
		String s = list.get(0);
		
		//2) TYPE-CASTING NOT REQUIRED
		//Integer i = list.get(0);
		System.out.println(list);
		
		
		
		//3) COMPILE-TIME-CHECKING
		
		List<String> l = new ArrayList<>();
		l.add("bhagyalaxmi");
		//l.add(675);   //compile checking
		System.out.println(l);
		
		
		
		
		
	}

}
