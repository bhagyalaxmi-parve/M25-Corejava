package org.tnsindia.regexdemo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx_PatternMethodDemo {

	
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String paatern = "BHAGYALAXMI PARVE";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the input for a matching=");
		String s = sc.nextLine();
		boolean result = Pattern.matches(paatern, s);
		System.out.println(result);
				

	}

}
