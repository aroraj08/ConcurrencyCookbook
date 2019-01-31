/**
 * 
 */
package com.generics;

/**
 * @author jatarora0
 *
 */
public class Shoe implements Sized {

	private int size;
	private String color;

	
	public Shoe(int size, String color) {
		this.size = size;
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	void setSize(int size) {
		this.size = size;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}
	
}
