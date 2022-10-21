package org.tnsindia.datetime;


import java.time.ZoneId;

public class Example_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LocalTime t=LocalTime.now(ZoneId.of("Asia/Kolkata"));
		
		//System.out.println(t);
		
		for(String  s:ZoneId.getAvailableZoneIds())
			
		{
			System.out.println(s);
		}

	}

}
