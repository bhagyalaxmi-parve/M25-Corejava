package org.tnsindia.annotations;


//Demo on  override  Annotation(built-in java annotation)


class parent{
	public void print()
	{
		System.out.println("Parent class method");
	}
}

class child extends parent{
	@Override
	
	public void print()
	{
		super.print();
		System.out.println("Child class method");
	}
}

public class Override_Annotation_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//parent c = new child();
		child c = new child();
		c.print();
          
	}

}
