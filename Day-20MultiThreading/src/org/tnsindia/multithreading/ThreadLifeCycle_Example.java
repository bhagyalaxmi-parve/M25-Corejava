package org.tnsindia.multithreading;

public class ThreadLifeCycle_Example implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      Thread t1=new Thread();
      t1.start();
      
      
      //if any thread is in the running state then you can't use again use start() state.
      //t1.start();    // exceptopn occurred
      
      
      
      
      
      /*try {
		t1.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		System.out.println("Exception handled"+e);
	}*/
      t1.setPriority(3);
      int priority = t1.getPriority();
      System.out.println(priority);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
