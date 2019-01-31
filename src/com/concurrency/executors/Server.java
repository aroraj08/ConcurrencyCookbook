package com.concurrency.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {

	private ThreadPoolExecutor executor;
	
	public Server() {
		this.executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
	}
	
	public void executeTask(Task task) {
		System.out.printf("Server: A new task has arrived\n");
		executor.execute(task);
		
		System.out.printf("Server: Pool Size: %d\n",executor.getPoolSize());
	    System.out.printf("Server: Active Count: %d\n",executor.getActiveCount());
	    System.out.printf("Server: Completed Tasks: %d\n",executor.getCompletedTaskCount());
	}
	
	public void endServer() {
		
		/*try {
	        Long duration=3l;
	        System.out.printf("Shutting down after %d seconds \n", duration);
	        TimeUnit.SECONDS.sleep(duration);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
		executor.shutdownNow();*/
		
		try {
			executor.awaitTermination(3l, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
