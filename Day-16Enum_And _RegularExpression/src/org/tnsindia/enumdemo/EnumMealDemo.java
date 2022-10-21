package org.tnsindia.enumdemo;

public class EnumMealDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*we can not create the object for enum
		Meal m1 = new Meal();*/
		
		//2.looping statement
		for(Meal m : Meal.values())
		{
			System.out.println(m+" "+ m.getValue());
		}
		
		

	}

}
