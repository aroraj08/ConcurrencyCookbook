package com.concurrency.cookbook;

import java.util.Date;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

public class WriterTask implements Runnable {

	private Deque<Event> deque;
	
	public WriterTask(Deque<Event> deque) {
		this.deque = deque;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<100; i++) {
			Event event = new Event();
			event.setEvent("event");
			event.setDate(new Date());
			this.deque.addFirst(event);
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
}
