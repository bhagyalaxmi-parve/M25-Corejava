package org.tnsindia.streamdemo;

import java.util.HashSet;
import java.util.Set;

public class Collection_LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Integer> obj = new HashSet<>();
		obj.add(45);
		obj.add(46);
		obj.add(47);
		obj.add(48);
		/*for(Integer itr:obj)
		{
			System.out.println(itr+"");
		}*/
		//instead of using looping statement we can extract the set element one line
		//Stream API
		obj.forEach(System.out::println);
		

	}

}
