package com.concurrency.evenodd;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProcessNumber processNumber = new ProcessNumber();
		processNumber.setNumber(0);
		
		EvenNumber evenThread = new EvenNumber(processNumber);
		OddNumber oddThread = new OddNumber(processNumber);
		
		Thread t1 = new Thread(evenThread);
		Thread t2 = new Thread(oddThread);
		
		t1.start();
		t2.start();
		
	}

}
