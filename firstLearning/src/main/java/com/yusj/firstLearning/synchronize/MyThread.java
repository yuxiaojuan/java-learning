package com.yusj.firstLearning.synchronize;

public class MyThread implements  Runnable {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ":" );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
