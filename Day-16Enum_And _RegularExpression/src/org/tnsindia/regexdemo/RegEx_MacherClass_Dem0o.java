package org.tnsindia.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_MacherClass_Dem0o {

	public static void main(String[] args) {
		
		//demo on matcher method of matcher class
		Pattern pt = Pattern.compile("bhagyalaxmi");
		Matcher mt= pt.matcher("my name is bhagyalaxmi");
		while(mt.find())
		{
			System.out.println("pattern found at = "+mt.start()+" "+mt.end());
		}

	}

}
