package org.tnsindia.array;


public class Variable_Arguments_Concept {
	
	
	//variable argument ...(ellipse)=>
	static void print(int a,int b, String... s)
	{
		System.out.println(a+","+b);
		//TO PRINT VARARGS
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+"\t");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fun call
				print(13,65,"Python","Java","C++");

	}

}
