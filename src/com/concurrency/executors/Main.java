package com.concurrency.executors;

public class Main {

	public static void main(String[] args) {
		
		Server server = new Server();
		
		for (int i=0; i< 100; i++) {
			server.executeTask(new Task("Task " + i));
		}
		
		server.endServer();
	}

}
