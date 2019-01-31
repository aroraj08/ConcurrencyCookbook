package com.concurrency.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Searcher implements Runnable {

	private int firstRow;
	private int lastRow;
	private MatrixMock mock;
	private Results results;
	private int number;
	
	private CyclicBarrier barrier;
	
	public Searcher(int firstRow, int lastRow, MatrixMock mock, Results results, int number, CyclicBarrier barrier) {
		super();
		this.firstRow = firstRow;
		this.lastRow = lastRow;
		this.mock = mock;
		this.results = results;
		this.number = number;
		this.barrier = barrier;
	}

	@Override
	public void run() {
		
		int counter = 0;
		System.out.printf("%s: Processing lines from %d to %d.\n",Thread.currentThread().getName(),firstRow,lastRow);
		
		for (int i=firstRow; i<lastRow; i++) {
			int row[] = mock.getRow(i);
			for (int j=0; j<row.length; j++) {
				if (row[j] == number) {
					counter++;
				}
			}
			results.setData(i, counter);	
		}
		
	    System.out.printf("%s: Lines processed.\n",Thread.currentThread().getName());
	    
	    try {
			barrier.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	    
	}
	

	
}
