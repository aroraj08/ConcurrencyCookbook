package com.concurrency.cookbook;

public class Account {
	
	private double balance;

	public void addAmount(double amount) {
		
		synchronized (this) {
			double tmp=balance;
			try {
			      Thread.sleep(10);
			    } catch (InterruptedException e) {
			      e.printStackTrace();
			    }
			tmp+=amount;
		    balance=tmp;
		}
	}
	
	public synchronized void subtractAmount(double amount) {
		double tmp=balance;
		try {
		      Thread.sleep(10);
		    } catch (InterruptedException e) {
		      e.printStackTrace();
		    }
		tmp-=amount;
	    balance=tmp;
	}
	
	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}
	
}
