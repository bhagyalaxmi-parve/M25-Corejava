package org.tnsindia.operator;

public class Ternary_Operator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=7;
		int res1 = (a % b == 0) ?  a:b;
		System.out.println(res1);
		
		
		//take input from user
		
		
		String res2 = (5 % 2 == 0) ?  "even" : "odd";
		System.out.println(res2);

	}

}
