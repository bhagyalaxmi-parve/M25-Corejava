package org.tnsindia.interfaceexample;

public class Employee implements HR, Manager {

	@Override
	public void projectdiscussion() {
		// TODO Auto-generated method stub
		
		System.out.println("about project discussion");
		
	}

	@Override
	public void salarydiscussion() {
		// TODO Auto-generated method stub
		System.out.println("about salary discussion");
		
	}

}
