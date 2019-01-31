package com.concurrency.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FactorialCalculator implements Callable<Integer> {

	private int number;
	
	public FactorialCalculator(int number) {
		this.number = number;
	}
	
	@Override
	public Integer call() throws Exception {
		
		try {
	        TimeUnit.MILLISECONDS.sleep(2000);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
		
		int result = 1;
		if (number == 0 || number == 1) {
			result = 1;
		} else {
			
			for (int i=2; i<=number; i++) {
				result = result*i;
			}
		}
		return result;
	}

	
}
