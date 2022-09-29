package org.tnsindia.abstraction;


//private specifier

class ABC
{
	private float salary;
	//getters and setters

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}


public class DemoOnPrivateSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ABC a = new ABC();
		a.setSalary(50000f);
		System.out.println("the salary is = "+a.getSalary());
	}

}
