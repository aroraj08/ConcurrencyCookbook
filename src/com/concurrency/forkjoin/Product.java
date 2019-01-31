package com.concurrency.forkjoin;

public class Product {

	private String name;
	private double price;
	
	public Product() {
		
	}
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	
	
}

