package org.tnsindia.annotations;

//Demo on Deprecated Annotation(built-in java annotation)

class deprecateddemo{
	
	
	@Deprecated
	
	//Deprecated method is used with unimportant method, fields ..
	public void display()
	{
		System.out.println("Deprecated Annotation Demo");
	}
}
public class Deprecated_Annotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deprecateddemo d = new deprecateddemo();
		d.display();
		
		

	}

}
