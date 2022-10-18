package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> obj = Arrays.asList(new String[]{"nayana", "rekha","asd","htf"});
		
		obj.stream().filter((i->i.length()>3)).forEach((i)->System.out.print(i+ " "));
		

	}

}
