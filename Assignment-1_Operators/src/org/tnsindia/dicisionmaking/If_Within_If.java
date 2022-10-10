package org.tnsindia.dicisionmaking;

public class If_Within_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    int age =15, weight=55;
		
		if(age>=12)
		{
			if(weight>=40  && weight<=110)
			{
				System.out.println("YOU ARE ELIGIBLE TO DONATE BLOOD");
			}
			else
			{
				System.out.println("YOU ARE NOT ELIGIBLE TO DONATE BLOOD");
			}
		}

	}

}
