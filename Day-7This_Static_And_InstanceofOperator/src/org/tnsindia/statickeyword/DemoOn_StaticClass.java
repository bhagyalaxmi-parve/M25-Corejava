package org.tnsindia.statickeyword;

class C
{
	//static variable
	public static String str="TNS India"; 
	/*A class can be made static only if it is a nested class*/
	//static class
	static class D
	{
		
		//static method
		/*IF THIS METHOD IS NON-STATIC THEN WE HAVE TO CREATE THE OBJECT*/
		public static  void print()
		{
			System.out.println(str);
		}
	}
}

public class DemoOn_StaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object creation
				//C.D obj=new org.tnsindia.statickeyword.C.D();
				//obj.print();
				C.D.print();
				

	}

}
