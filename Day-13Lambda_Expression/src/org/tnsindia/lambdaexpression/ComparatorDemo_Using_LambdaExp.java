package org.tnsindia.lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo_Using_LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<String>obj=(s1,s2)->Integer.compare(s1.length(), s2.length());
		String str[]= {"sakshi","rohit","preeti","pooja"};
		
		//arrange into the ascending order
		Collections.sort(Arrays.asList(str),obj);
		
		//enhanced for loop to return the string
		for(String itr:str)
		{
			System.out.println(itr+" ");
		}

	}

}
