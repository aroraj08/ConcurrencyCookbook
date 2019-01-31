package com.generics;

public class MainPair {

	public static void main(String[] args) {
		
		ClothingPair<Shoe> pair1 = new ClothingPair<>(new Shoe(11, "Brown"), new Shoe(11, "Brown"));
		System.out.println(pair1.isMatched());
	}

}
