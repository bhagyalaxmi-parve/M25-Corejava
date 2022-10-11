package org.tnsindia.overloading;





class Renault{
	
	//constructor overloading
	
	//parameterized constructor
	public String engine;
	Renault(String engine)
	{
		this.engine=engine;
	}
	
	
	//default constructor
	Renault()
	{
		System.out.println("Default Constructor");
	}
	public void display()
	{
		System.out.println("engine is = "+engine);
	}
}

public class Constructor_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("unused")
		Renault r = new Renault();
		Renault r2 = new Renault("Disel");
		r2.display();

	}

}
