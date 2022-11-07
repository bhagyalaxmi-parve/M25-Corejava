package org.tnsindia.multithreading;

public class SynchronizedMethod_Demo {

	
	@SuppressWarnings("unused")
	synchronized void arraysum(int   arr[])
	{
		int sum=0;
		
			
		for(int itr:arr)
		{
			System.out.println(Thread.currentThread());
		}
		try {
		Thread.sleep(600);
		}
		catch(InterruptedException e)
		{
			throw new RuntimeException(e);
		}
	}
	

}
