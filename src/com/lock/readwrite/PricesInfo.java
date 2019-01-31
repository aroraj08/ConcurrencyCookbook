/**
 * 
 */
package com.lock.readwrite;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author jatarora0
 *
 */
public class PricesInfo {

	private double price1;
	private double price2;
	private ReadWriteLock lock;
	
	public PricesInfo() {
		this.lock = new ReentrantReadWriteLock();
		this.price1 = 1.0;
		this.price2 = 2.0;
	}
	
	public double getPrice1() {
		
		this.lock.readLock().lock();
		double price = this.price1;
		this.lock.readLock().unlock();
		return price;
	}
	
	public double getPrice2() {
	    this.lock.readLock().lock();
	    double value=price2;
	    this.lock.readLock().unlock();
	    return value;
	  }
	
	public void setPrices(double price1, double price2) {
		
		this.lock.writeLock().lock();
		this.price1 = price1;
		this.price2 = price2;
		this.lock.writeLock().unlock();
	}
}	
