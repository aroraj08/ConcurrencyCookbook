package com.concurrency.cookbook;

import java.util.concurrent.TimeUnit;

public class NetworkConnectionsLoader implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Method execution starts...");
		try {
			TimeUnit.SECONDS.sleep(6);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Method execution ends...");
	}

	
}
