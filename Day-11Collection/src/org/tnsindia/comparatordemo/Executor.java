package org.tnsindia.comparatordemo;

import java.util.Arrays;

public class Executor {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp[] = new Employee[2];
		//for employee 1
		emp[0]=new Employee();
		emp[0].setAge(25);
		emp[0].setName("om|");
		
		emp[1]=new Employee();
		emp[1].setAge(30);
		emp[1].setName("diksha");
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Employee "+(i+1)+"Name="
					+emp[i].getName()+""+emp[i].getAge());
		}
//		Age_Comparator a1 = new Age_Comparator();
//		a1.compare(01, 02);
		Arrays.sort(emp, new Age_Comparator());
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Employee "+(i+1)+"Name="
					+emp[i].getName()+""+emp[i].getAge());
		}
	}

}
