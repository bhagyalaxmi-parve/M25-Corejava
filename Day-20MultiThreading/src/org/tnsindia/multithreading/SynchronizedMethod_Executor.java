package org.tnsindia.multithreading;

public class SynchronizedMethod_Executor {

	public static void main(String[] args) {
		
		SynchronizedMethod_Demo m=new SynchronizedMethod_Demo();
		Thread t1=new Thread(()->m.arraysum(new int[] {11,22,33}));
		Thread t2=new Thread(()->m.arraysum(new int[] {10,27,39}));
         t1.start();

         t2.start();
	}

}
