package org.tnsindia.parametrized;

import java.util.Scanner;

class Bike{
	public int speed;

     Bike(int a)
     {
    	 speed=a;
    	 System.out.println("speed is = "+speed +" km/hr");
     }


}



public class ParameterizedConstructor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter speed");
		int speed = sc.nextInt();
	     Bike a1 =new Bike(speed);

	}

}
