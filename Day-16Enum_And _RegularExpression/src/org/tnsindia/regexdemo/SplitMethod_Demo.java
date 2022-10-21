package org.tnsindia.regexdemo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SplitMethod_Demo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		
		String str = sc.nextLine();
		
		
		String delimiter="-";
		//String delimiter="b";
		//String delimiter="@";
		Pattern pt = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
		String [] res = pt.split(str);
		
		for(String s1 : res)
	       { 
			System.out.println(s1);
			
	       }
	         }

}
