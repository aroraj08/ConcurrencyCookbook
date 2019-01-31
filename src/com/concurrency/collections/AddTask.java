package com.concurrency.collections;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class AddTask implements Runnable {

	private Deque<String> list;
	
	public AddTask(Deque<String> list) {
		super();
		this.list = list;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i=0; i<10000;i++) {
			list.add(name+": Element "+i);
		}
	}
	
}
