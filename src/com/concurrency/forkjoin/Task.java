package com.concurrency.forkjoin;

import java.util.List;
import java.util.concurrent.RecursiveAction;

public class Task extends RecursiveAction {
	
	private List<Product> products;
	private int first;
	private int last;
	private double increment;
	
	public Task(List<Product> products, int first, int last, double increment) {
		super();
		this.products = products;
		this.first = first;
		this.last = last;
		this.increment = increment;
	}

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void compute() {
		if (last-first < 10) {
			updatePrices();
		} else {
			int middle = (last+first)/2;
			System.out.printf("Task: Pending tasks: %s\n",getQueuedTaskCount());
			Task t1 = new Task(products, middle+1, last, increment);
			Task t2 = new Task(products, first, middle+1, increment);
			
			invokeAll(t1, t2);
		}
	}

	private void updatePrices() {
		
		for (int i=first; i<last; i++) {
			Product product = products.get(i);
			product.setPrice(product.getPrice()*(1+increment));
		}
	}

	
}
 