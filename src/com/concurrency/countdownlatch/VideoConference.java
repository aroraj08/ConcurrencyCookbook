/**
 * 
 */
package com.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author jatarora0
 *
 */
public class VideoConference implements Runnable {
	
	private CountDownLatch controller;
	
	public VideoConference(int participants) {
		this.controller = new CountDownLatch(participants);
	}
	
	@Override
	public void run() {
		System.out.printf("Initilzing Video Conferencing. Expecting %d members", controller.getCount());
		
		try {
			controller.await();
			
			System.out.println("All participants have arrived");
			System.out.println("Lets get started...");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void arrive(String name) {
		System.out.println(name + " has arrived");
		controller.countDown();
		System.out.printf("waiting for %d participants", controller.getCount());
		System.out.println("");
	}
	
	
}
