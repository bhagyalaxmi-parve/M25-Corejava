package org.tnsindia.exception;


public class FinallyBlock_NotExecuted {
	 public static void  print()
	    {
		  try 
		 {
		  int x=12;
		   int y=0;
		  System.out.println("inside  try block" +x/y);
		  System.exit(0);
		}
		  
		  catch (Exception e)
		  {
			  System.out.println("catch try block");
		  }
		  
		  finally {
		  System.out.println("Finally block");
			  
	  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinallyBlock_NotExecuted.print();

	}

}
