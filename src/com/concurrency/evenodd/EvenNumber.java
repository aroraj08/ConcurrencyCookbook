package com.concurrency.evenodd;

public class EvenNumber implements Runnable {

	private ProcessNumber processNumber;

	public EvenNumber(ProcessNumber processNumber) {
		super();
		this.processNumber = processNumber;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
			processNumber.printEven();
	}

}
