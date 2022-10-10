package org.tnsindia.dicisionmaking;

public class Nested_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int a=12, b=66, c=23;
		
		if(a>b   && a>c)
		{
			System.out.println("a is greater than b and c  "+ "\na is= " +a);
		}
		else if(b>a  && b>c)
		{
			System.out.println("b is greater than a and c "+ "\nb is= " +b);
		}
		else {
			System.out.println("c is greater than a and b"+ "\nc is= " +c);
			
		}
	}

}
