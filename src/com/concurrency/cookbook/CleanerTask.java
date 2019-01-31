package com.concurrency.cookbook;

import java.util.Date;
import java.util.Deque;

public class CleanerTask extends Thread {

	private Deque<Event> deque;
	
	public CleanerTask(Deque<Event> deque) {
		this.deque = deque;
		setDaemon(true);
	}
	
	@Override
	public void run() {
		while(true) {
			Date date = new Date();
			clean(date);
		}
	}

	private void clean(Date date) {
		// TODO Auto-generated method stub
		
		boolean deleted = false;
		
		if (deque.isEmpty()) {
			return;
		}
		
		long difference = 0;
		
		do {
			Event event = deque.getLast();
			
			difference = date.getTime() - event.getDate().getTime() ;
			
			if (difference > 10000) {
				System.out.printf("Cleaner: %s\n",event.getEvent());
				deque.removeLast();
				deleted = true;
			}
		} while (difference > 10000);
		
		if (deleted){
		      System.out.printf("Cleaner: Size of the queue: %d\n",deque.size());
		    }
		
	}
}
