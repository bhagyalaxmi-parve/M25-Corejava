package org.tnsindia.operator;

//public class Bitwise_Operator {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int a=8 ,b=2;
//		int res1 = a & b;
//		int res2 = a | b;
//		int res3 = a ^ b;
//		System.out.println(res1);
//		System.out.println(res2);
//		System.out.println(res3);
//
//
//	}
//
//}


class Test
{

static int a;

static

{ 
	a=4;

System.out.println ("inside static blockn"); 
System.out.println("a="+a);

}

Test()


{ 
	System.out.println ("ninside constructorn");
	a = 10;
}

public static void func() {

a=a+1;


System.out.println("a = "+a);
}

@SuppressWarnings("static-access")
public static void main(String[] args)
{

Test obj = new Test(); obj.func();
}
}

