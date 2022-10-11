package org.tnsindia.overriding;

import java.util.Scanner;

class HeadQuaters{
	
	
	
	protected int toatal_employee;
	protected String city;
	Scanner sc = new Scanner(System.in);
	
	public void getDetails()
	{
		
		
		System.out.println("Enterbthe city where HeadQuaters is situated");
		city = sc.nextLine();
		
		System.out.println("Enterbthe total no.of employee in that city headquaters");
	
		toatal_employee = sc.nextInt();
	}
	public void showDetails()
	{
		
		System.out.println("Company is located in = "+city+
				"and the no.of employee in Main-branch is = "+toatal_employee );
	}
	
	
}


//child class
class Mainbranch extends HeadQuaters{
	public int toatal_employeeMB;
	public String cityMB;
	public void getDetails()
	
	
	{
		super.getDetails();
		System.out.println("HeadQuaters");
		System.out.println("Enter  the city where HeadQuaters Main-branch is situated");
		//to give the input in a new line
		sc.nextLine();
		cityMB = sc.nextLine();
		
		System.out.println("Enter the total no.of employee in that city headquaters");
	
		toatal_employeeMB = sc.nextInt();
	}
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Main branch");
		System.out.println("Company is located in = "+cityMB+
				"\n and the no.of employee in Main-branch is = "+toatal_employeeMB );
	}
	
}

public class DemoOn_MethodOverriding_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mainbranch m = new Mainbranch();
		m.getDetails();
		m.showDetails();

	}

}
