package com.concurrency.semaphores;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		PrintQueue printQueue = new PrintQueue();
		
		Thread[] t = new Thread[10];
			
		Arrays.asList(t).forEach(x -> { 
			x = new Thread(new Job(printQueue)); 
			x.start();
		});
		
	}

}
