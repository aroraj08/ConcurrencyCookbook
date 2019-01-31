package com.training;

import java.util.concurrent.Callable;

public class PrimeCallable implements Callable<PrimeResult> {

	long mPrimeCandidate;
	
	long getmPrimeCandidate() {
		return mPrimeCandidate;
	}

	void setmPrimeCandidate(long mPrimeCandidate) {
		this.mPrimeCandidate = mPrimeCandidate;
	}

	public PrimeCallable(long mPrimeCandidate) {
		super();
		this.mPrimeCandidate = mPrimeCandidate;
	}

	@Override
	public PrimeResult call() throws Exception {
		
		return new PrimeResult(mPrimeCandidate, isPrime(mPrimeCandidate));
	}
	
	private static long isPrime(long n) {  
	       if (n <= 1) {  
	           return 0;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return 32;  
	           }  
	       }  
	       return 32;  
	   } 
}
