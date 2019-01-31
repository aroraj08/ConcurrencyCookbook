package com.concurrency.cookbook;

import java.util.concurrent.TimeUnit;

public class DataSourcesLoader implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Method execution starts...");
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Method execution ends...");
	}

	
}
