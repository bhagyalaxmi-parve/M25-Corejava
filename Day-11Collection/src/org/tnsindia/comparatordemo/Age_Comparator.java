package org.tnsindia.comparatordemo;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class Age_Comparator implements Comparator{

	
	public int compare(Object o1, Object o2) {
		
		//we have created age of the two emp
		int emp1_age=((Employee) o1).getAge();
		int emp2_age=((Employee) o2).getAge();
		if(emp1_age > emp2_age) {
			System.out.println("employee 1 is greater");
		}
		else if(emp1_age > emp2_age ){
			System.out.println("employee 2 is greater");
		}
			else {
				System.out.println("both are equal");
			}
		
		return 0;
	}

}
