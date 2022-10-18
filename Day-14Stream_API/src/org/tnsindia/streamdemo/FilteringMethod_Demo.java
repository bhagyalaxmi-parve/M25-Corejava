package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;

public class FilteringMethod_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> obj1=Arrays.asList(new Integer[] {10,20,30,40});
		//filter)( method
		obj1.stream().filter((i)->i>50).forEach((i)->System.out.print(i+""));
        System.out.println();
        
        
        obj1.stream().distinct().forEach((i)->System.out.print(i+""));
        System.out.println();
        
        
		//limit(n)
		obj1.stream().limit(3).forEach((i)->System.out.print(i+" "));
		System.out.println();
		//skip(n)
		obj1.stream().skip(4).forEach((i)->System.out.print(i+" "));

        
	}

}
