package com.concurrency.producerconsumer;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer {

	private Lock lock;
	private Condition lines;
	private Condition space;
	private LinkedList<String> buffer;
	private boolean pendingLines;
	private int maxSize;
	
	
	public Buffer(int maxSize) {
		super();
		this.lock = new ReentrantLock();
		
		this.lines = this.lock.newCondition();
		this.space = this.lock.newCondition();
		this.buffer = new LinkedList<>();
		this.pendingLines = true;
		this.maxSize = maxSize;
	}
	
	public void insert(String line) {

		this.lock.lock();

		try {
			while(buffer.size() == maxSize) {
				space.await();
			}
			buffer.offer(line);
			System.out.printf("%s: Inserted Line: %d\n", Thread.currentThread().getName(),buffer.size());
			lines.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			this.lock.unlock();
		}
	}
	
	public String get() {
		this.lock.lock();
		String line=null;
		try {
			while(buffer.size() == 0 && (hasPendingLines())) {
				lines.await();
			}
			if (hasPendingLines()) {
				line = buffer.poll();
				System.out.printf("%s: Line Readed: %d\n",Thread.currentThread().getName(),buffer.size());
				space.signalAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			this.lock.unlock();
		}
		return line;
	}
	
	public boolean hasPendingLines() {
		return pendingLines || buffer.size()>0;
	}
	
	Lock getLock() {
		return lock;
	}
	void setLock(Lock lock) {
		this.lock = lock;
	}
	Condition getLines() {
		return lines;
	}
	void setLines(Condition lines) {
		this.lines = lines;
	}
	Condition getSpace() {
		return space;
	}
	void setSpace(Condition space) {
		this.space = space;
	}
	LinkedList<String> getBuffer() {
		return buffer;
	}
	void setBuffer(LinkedList<String> buffer) {
		this.buffer = buffer;
	}
	boolean isPendingLines() {
		return pendingLines;
	}
	void setPendingLines(boolean pendingLines) {
		this.pendingLines = pendingLines;
	}
	int getMaxSize() {
		return maxSize;
	}
	void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	
	
}
