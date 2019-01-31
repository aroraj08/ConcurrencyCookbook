package com.concurrency.collections;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		Thread[] additionThread = new Thread[100];
		Thread[] pollingThread = new Thread[100];
		
		Deque<String> list = new ConcurrentLinkedDeque<>();
		
		//Deque<String> list = new ArrayDeque<>();
		
		//AddTask addTask = new AddTask(list);
		//PollTask pollTask = new PollTask(list);
		
		IntStream.range(0, 100).forEach(
				t -> {
					additionThread[t] =new Thread(new AddTask(list)); 
					additionThread[t].start();
				}
			);
		
		IntStream.range(0, 100).forEach(
					x -> {
						try{
							additionThread[x].join();
						} catch (InterruptedException ie) {
							ie.printStackTrace();
						}
					}
				);
		System.out.println(list.size());
		
		IntStream.range(0, 100).forEach(
				t -> {
					pollingThread[t] = new Thread(new PollTask(list));
					pollingThread[t].start();
				}
			);
		
		IntStream.range(0, 100).forEach(
				x -> {
					try{
						pollingThread[x].join();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
			);
		
		System.out.println(list.size());
		
	}

}
