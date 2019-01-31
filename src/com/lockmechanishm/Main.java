package com.lockmechanishm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintQueue printQueue = new PrintQueue();
		
		Thread t1 = new Thread(new Job(printQueue));
		Thread t2 = new Thread(new Job(printQueue));
		Thread t3 = new Thread(new Job(printQueue));
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
