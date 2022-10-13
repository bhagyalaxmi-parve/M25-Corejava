package org.tnsindia.customexception;




//Example on Custom Exception

class SimpleCustomException extends Exception
{
	public String str;

	//constructor
	public SimpleCustomException(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "SimpleCustomException [str=" + str + "]";
	}
	
	
}
public class DemoOn_SimpleCustom_Exception {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//In order to use our own custom exception,we have ve to create a new object of the class
  //and throw it using the throw keyword
		 
		try {
			throw new SimpleCustomException("User-Defined Exception ");
			
			
		}
		catch(SimpleCustomException e)
		{
			System.out.println(e);
			
		}

		
		
	}

}
