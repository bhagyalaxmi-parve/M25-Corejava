package org.tnsindia.packageexample;


import java.util.Scanner;

//importing the package
import org.tnsindia.packageDemo.PackageDemo;

public class PackageClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str1 = sc.nextLine();
		//object creation
		PackageDemo dm = new PackageDemo();
		dm.str=str1;
		dm.display();

	}

}
