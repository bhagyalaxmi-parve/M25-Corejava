package org.tnsindia.multithreading;

//implementing runnable method
public class MultiThread_Demo implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread("Thread1");
		Thread t2=new Thread("Thread2");
		t1.start();
		t2.start();
//		MultiThread_Demo mt=new MultiThread_Demo();
//		mt.run();
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());//lowest priority bydefault=5...//highest=10
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("the thread is in the running state");
	}

}
