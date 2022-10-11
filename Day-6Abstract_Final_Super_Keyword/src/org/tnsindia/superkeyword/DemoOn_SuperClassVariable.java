package org.tnsindia.superkeyword;

//Parent class or Super class or Base class
class Animal
{
	protected String name="Animal";
	
}
//Child Class
class Dog extends Animal
{
	public String name="Dog";
	//method overriding
	public void display()
	{
		
		System.out.println("The name of the animal is: "+name);
		//to call super class variable
		System.out.println(super.name);

	}
}


public class DemoOn_SuperClassVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.display();

	}

}
