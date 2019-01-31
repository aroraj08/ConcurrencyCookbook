package com.lockmechanishm;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintQueue {
	
	private Lock queueLock = new ReentrantLock(true);
	
	public void printJob(Object document) {
		
		/*
		boolean isLocked = false;
		
		while(!isLocked) {
			isLocked = this.queueLock.tryLock();
		}
		*/
		this.queueLock.lock();
		
		try {
			Long duration = (long) (Math.random()*10000);
			
			 System.out.println(Thread.currentThread().getName()+ ": PrintQueue: Printing a Job during "+(duration/1000)+ 
					 " seconds");
			 Thread.sleep(duration);
					       
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.queueLock.unlock();
		}
		
		this.queueLock.lock();
		
		try {
			Long duration = (long) (Math.random()*10000);
			
			 System.out.println(Thread.currentThread().getName()+ ": PrintQueue: Printing a Job during "+(duration/1000)+ 
					 " seconds");
			 Thread.sleep(duration);
					       
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.queueLock.unlock();
		}
	}
}
