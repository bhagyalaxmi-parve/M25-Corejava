package org.tnsindia.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str = "17-10-2022 14:38";
		//DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm");
		
		//LocalDateTime l = LocalDateTime.parse(str,df);
		LocalDateTime l=LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
		String str = l.format(df);
		System.out.println(str);

	}

}
