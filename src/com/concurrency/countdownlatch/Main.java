package com.concurrency.countdownlatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		VideoConference videoConference = new VideoConference(10);
		Thread t1 = new Thread(videoConference);
		t1.start();
		
		Participant[] participants = new Participant[10];
		
		AtomicInteger count = new AtomicInteger(0);
		
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		
		
		Arrays.asList(participants).forEach(p -> {
			p = new Participant(videoConference, "Name" + count);
			Thread t = new Thread(p);
			t.start();
		});
		
		/*list.forEach(i -> {
			
			participants[i] = new Participant(videoConference, "Name" + i);
			Thread t = new Thread(participants[i]);
			t.start();

		});*/
		
	}

}
