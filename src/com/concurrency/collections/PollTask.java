package com.concurrency.collections;

import java.util.Deque;

public class PollTask implements Runnable {

	private Deque list;
	
	public PollTask(Deque list) {
		super();
		this.list = list;
	}
	
	@Override
	public void run() {
		
		for (int i=0; i<5000; i++) {
			list.pollFirst();
			list.pollLast();
		}
	}
	
}
