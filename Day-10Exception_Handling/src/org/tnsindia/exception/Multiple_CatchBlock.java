package org.tnsindia.exception;

public class Multiple_CatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
		int x= args.length;
		System.out.println("The length of x is = "+x);
		//int y= 12/x;
		int arr[] = {10,20,30};
		//System.out.println("array index valuue is = "+arr[3]);
		arr[3]=55;
		
		}
		catch(ArithmeticException ae)
		{
			
		System.out.println("Arithmetic exception occured = "+ae);
		}
		
		
		
		catch(ArrayIndexOutOfBoundsException ab)
		{
			
		System.out.println("Arary Index Out of Bounds exception occured = "+ab);
		}
		
		catch(Exception e)
		{
			
		System.out.println("exception occured = "+e);
		}

		finally {
			System.out.println("Finnaly block");
		}
	}

}
