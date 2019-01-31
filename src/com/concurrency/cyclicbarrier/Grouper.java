package com.concurrency.cyclicbarrier;

public class Grouper implements Runnable {

	private Results results;


	public Grouper(Results results) {
		super();
		this.results = results;
	}

	@Override
	public void run() {

		int finalResult =0;
		int data[]=results.getData();

		for (int number:data) {
			finalResult+=number;
		}
		System.out.printf("Grouper: Total result: %d.\n",finalResult);
	}

}
