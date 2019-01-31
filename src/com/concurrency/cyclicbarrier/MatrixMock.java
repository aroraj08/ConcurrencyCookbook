package com.concurrency.cyclicbarrier;

import java.util.Random;

public class MatrixMock {

	private int data[][];
	private int counter;
	private Random random;
	
	public MatrixMock(int rows, int columns, int number) {
		data = new int[rows][columns];
		counter = 0;
		random = new Random();
		
		for (int i=0; i < rows; i++) {
			for (int j=0; j < columns; j++) {
				int val = random.nextInt(10);
				data[i][j] = val;
				if (val == number) {
					counter++;
				}
			}
		}
		
		System.out.printf("There are %d occurences of number", counter);
	}
	
	
	public int[] getRow(int pos) {
		
		if (pos >=0 && pos < data.length) {
			return data[pos];
		}
		return null;
	}
	
	
}
