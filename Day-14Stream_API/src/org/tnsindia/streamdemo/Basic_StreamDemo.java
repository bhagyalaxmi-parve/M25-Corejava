package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Basic_StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String>obj=Stream.of("sakshi","priyanka","Babita");
		
		//forEach-terminal operation
		obj.forEach((i)->System.out.println(i+" "));
		
		System.out.println();

		List<Integer>obj1=Arrays.asList(new Integer[] {10,20,30,40}); 
		obj1.forEach((i)->System.out.println(i+" "));

		

	}

}
