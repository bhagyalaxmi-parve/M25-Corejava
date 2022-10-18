package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> obj1=Arrays.asList(new Integer[] {10,20,30,40});
		Optional<Integer>obj2 = obj1.stream().reduce((a,b)->a>b?a:b);
		if(obj2.isPresent())
		{
			System.out.println(obj2.get());
		}

}
}
