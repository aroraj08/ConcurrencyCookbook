/**
 * 
 */
package com.training;

/**
 * @author jatarora0
 *
 */
public class PrimeRunnable implements Runnable {

	private Long number;
	
	public PrimeRunnable(Long number) {
		super();
		this.number = number;
	}

	@Override
	public void run() {
		isPrime(this.number);
	}

	public static boolean isPrime(long n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   } 
	
}
