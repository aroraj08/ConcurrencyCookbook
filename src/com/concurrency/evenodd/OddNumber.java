package com.concurrency.evenodd;

public class OddNumber implements Runnable {

	private ProcessNumber processNumber;

	public OddNumber(ProcessNumber processNumber) {
		super();
		this.processNumber = processNumber;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		processNumber.printOdd();
	}

}
