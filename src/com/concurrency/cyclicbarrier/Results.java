package com.concurrency.cyclicbarrier;

public class Results {

	private int data[];

	public Results(int size) {
		super();
		this.data = new int[size];
	}

	public void  setData(int position, int value){
		data[position]=value;
	}

	public int[] getData(){
		return data;
	}

}