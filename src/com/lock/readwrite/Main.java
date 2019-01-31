package com.lock.readwrite;

public class Main {

	public static void main(String[] args) {
		
		PricesInfo pricesInfo = new PricesInfo();
		
		Thread[] readerThreads = new Thread[5];
		for (int i=0; i < 5; i++) {
			
			readerThreads[i] = new Thread(new Reader(pricesInfo));
			
		}
		Thread writerThread = new Thread(new Writer(pricesInfo));
		
		for (int i=0; i < 5; i++) {
			readerThreads[i].start();
		}
		writerThread.start();
	}
}
