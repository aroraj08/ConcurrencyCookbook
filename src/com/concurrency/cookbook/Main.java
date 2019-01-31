package com.concurrency.cookbook;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataSourcesLoader dataSourceLoader = new DataSourcesLoader();
		Thread t1 = new Thread(dataSourceLoader);
		
		NetworkConnectionsLoader networkConnectionLoader = new NetworkConnectionsLoader();
		Thread t2 = new Thread(networkConnectionLoader);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Thread execution ends...");
	}

}
