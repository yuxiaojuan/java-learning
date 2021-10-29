package com.yusj.firstLearning.basic.concurrency.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import com.yusj.firstLearning.basic.concurrency.thread.MyCallable;
import com.yusj.firstLearning.basic.concurrency.thread.MyRunnable;

public class MyFixedThreadPool {



	public static void main(String[] args) {
		int taskSize = 5;
		ExecutorService threadPool = Executors.newFixedThreadPool(taskSize);
		ExecutorService threadPool1 = Executors.newCachedThreadPool();
		ScheduledExecutorService threadPool2 = Executors.newScheduledThreadPool(taskSize);
		ExecutorService threadPool3 = Executors.newSingleThreadExecutor();

		MyCallable test1 = new MyCallable();
		MyRunnable test2 = new MyRunnable();
		threadPool2.submit(test1);
		threadPool2.scheduleAtFixedRate(test2,5,1, TimeUnit.MINUTES);
		threadPool2.scheduleWithFixedDelay(test2,5,1, TimeUnit.MINUTES);

		ReentrantLock lock = new ReentrantLock();
		lock.lock();
		lock.unlock();
	}
}
