package org.tnsindia.datatype;

import java.util.Scanner;

public class ByteDatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//byte range = -128 to 127
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		byte num = 127;
		System.out.println("Enter Number");
		num = sc.nextByte();
		System.out.println("number is = "+num);
	}

}
