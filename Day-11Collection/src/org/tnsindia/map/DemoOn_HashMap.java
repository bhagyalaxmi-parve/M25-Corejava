package org.tnsindia.map;

import java.util.HashMap;
import java.util.Map;

public class DemoOn_HashMap {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<Integer.String> obj = new Map<>();
		Map<Integer,String> obj = new HashMap<>();
		//1.key cannot be duplicated but value can be duplicated
		//2.it follows the sorting order
		obj.put(1, "nayana");
		obj.put(2, "sakshi");
		obj.put(4, "aanand");
		obj.put(3, "neha");
		obj.put(5, "nayana");
	     obj.put(null, null);
	     obj.put(6, null);

		System.out.println(obj);
		
		obj.remove(1);
		System.out.println(obj);
		for(Map.Entry m : obj.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		
	}

}
