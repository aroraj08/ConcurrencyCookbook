package com.concurrency.producerconsumer;

public class Producer implements Runnable {

	private Buffer buffer;
	private FileMock mock;
	
	public Producer(FileMock mockFile, Buffer buffer) {
		this.buffer = buffer;
		this.mock = mockFile;
	}
	
	@Override
	public void run() {
		
		buffer.setPendingLines(true);
		
		while (mock.hasMoreLines()){
			String line=mock.getLine();
			buffer.insert(line);
		}
		    buffer.setPendingLines(false);
	}

}
