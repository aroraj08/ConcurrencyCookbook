package com.generics.revised;

public class Shoe implements Clothable {

	private int size;
	private String color;
	
	public Shoe(int size, String color) {
		this.size = size;
		this.color = color;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public String getColor() {
		return color;
	}

}
