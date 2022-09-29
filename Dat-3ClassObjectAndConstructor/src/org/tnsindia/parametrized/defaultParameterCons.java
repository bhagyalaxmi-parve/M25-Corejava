package org.tnsindia.parametrized;

import java.util.Scanner;

class truck
{
	public int speed;
	 truck()
	 {
	   	 speed=560;
	   	 System.out.println("speed is = "+speed +" km/hr");
	    }
	
	//parameterized constructor
    truck(int a)
    {
   	 speed=a;
   	 System.out.println("speed is = "+speed +" km/hr");
    }
}




public class defaultParameterCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Speed = ");
		int speed = sc.nextInt();
		truck t = new truck(speed);
		truck t1 = new truck();
		
	sc.close();	
		
		

	}

}
