package org.tnsindia.abstraction;



class AA
{
	public String dob="14/07/2000";
	void display()
	{
		System.out.println(" Birth date is = "+dob);
	}
}



public class DemoOnPublicAccessSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA a =new AA();
		a.display();
		
		
		

	}

}
