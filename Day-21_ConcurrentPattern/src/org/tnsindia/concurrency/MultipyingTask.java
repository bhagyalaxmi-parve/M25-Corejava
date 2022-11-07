package org.tnsindia.concurrency;

import java.util.concurrent.Callable;


//collable interface
@SuppressWarnings("rawtypes")
public class MultipyingTask implements Callable{

	
	int x,y;
	long sleeptime;
	
	//parameterized constructor
	public MultipyingTask(int x, int y, long sleeptime) {
		super();
		this.x = x;
		this.y = y;
		this.sleeptime = sleeptime;
	}

	@Override
	public Object call() throws Exception {
		Thread.sleep(sleeptime);
		return x*y;
	}
	
	

}
