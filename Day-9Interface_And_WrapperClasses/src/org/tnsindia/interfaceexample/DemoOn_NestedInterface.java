package org.tnsindia.interfaceexample;

import java.util.Scanner;

//program on nested interface
interface OuterInterface{
	
	
	//abstract method by default
	void print();
	interface InnerInterface{
		//abstract method by default
		void display();
	}
}


class ImplemwntableClass implements org.tnsindia.interfaceexample.OuterInterface.InnerInterface{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the batch");
		String str= s.nextLine();
		
		System.out.println(" the batch is "+str);
	}
	
}

class ImplemwntableClassp implements OuterInterface{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(" working on nested interface ");
	}
	
}
public class DemoOn_NestedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplemwntableClass i = new ImplemwntableClass();
		i.display();
		ImplemwntableClassp i1 = new ImplemwntableClassp();
		i1.print();
	}

}
