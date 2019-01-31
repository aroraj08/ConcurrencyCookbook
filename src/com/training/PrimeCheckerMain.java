package com.training;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class PrimeCheckerMain {

	public static void main(String[] args) {
		
		/*
		List<String> list= Arrays.asList("Jatin","Loves","Preeti"); 
		
		System.out.println(list.stream()
				.filter(str -> str.equalsIgnoreCase("Preeti"))
				.mapToInt(String:: length).sum());
		
		System.out.println(list.stream().reduce((x,y) -> x + " " + y).get());
		
		*/
		
		ExecutorService mExecutors = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		new Random().longs(100l, Long.MAX_VALUE - 100, Long.MAX_VALUE)
		.forEach(value -> mExecutors.execute(new PrimeRunnable(value)));
		
		
		List<Future<PrimeResult>> futures = 
			new Random()
			.longs(5l, Long.MAX_VALUE - 5l, Long.MAX_VALUE)
			.mapToObj(PrimeCallable:: new)
			//.map(x -> mExecutors.submit(x))
			.map(mExecutors::submit)
			.collect(Collectors.toList());
			
		//.map(mRetainedState.mExecutorService::submit)
		
	}

}
