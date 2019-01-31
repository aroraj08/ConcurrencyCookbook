package com.concurrency.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		List<Future<Integer>> resultList = new ArrayList<>();
		
		Random random = new Random();
		
		// below approach uses submit
		
		for (int i=0; i<10; i++) {
			int number = random.nextInt(10);
			Future<Integer> result = executor.submit(new FactorialCalculator(number));
			resultList.add(result);
		}
		
		// below approach uses invokeAll - start
		/*
		List<FactorialCalculator> calculatorList = new ArrayList<FactorialCalculator>();
		
		for (int j=0; j < 10; j++) {
			int number = random.nextInt(10);
			calculatorList.add(new FactorialCalculator(number));
		}
		
		try {
			resultList = executor.invokeAll(calculatorList);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		// below approach uses invokeAll - end
		
		/*do {
			
			for (int i =0; i < 10; i++) {
				Future<Integer> result = resultList.get(i);
				System.out.printf("Main: Task %d: %s\n",i,result.isDone());
			}
			
			try {
		        TimeUnit.MILLISECONDS.sleep(50);
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
		} while (executor.getCompletedTaskCount() < resultList.size());*/
	
		
		System.out.printf("Main: Results\n");
	    for (int i=0; i<resultList.size(); i++) {
	      Future<Integer> result=resultList.get(i);
	      Integer number=null;
	      try {
	        number=result.get();
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      } catch (ExecutionException e) {
	        e.printStackTrace();
	      }
	      System.out.printf("Main: Task %d: %d\n",i,number);
	    }
	    
	    executor.shutdown();
	}
}
