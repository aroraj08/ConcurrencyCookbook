package com.generics.revised;

public class Main {

	public static void main(String[] args) {
		
		Pair<Clothable> pair1 = new Pair<>(new Shoe(11, "Black"), new Shoe(11, "Black"));
		Pair<Clothable> pair2 = new Pair<>(new Shoe(11, "Black"), new Shoe(12, "Black"));
		
		ClothingPair cp1 = new ClothingPair<>(new Shoe(11, "Black"), new Shoe(11, "Black"));
		ClothingPair cp2 = new ClothingPair<>(new Shoe(11, "Black"), new Shoe(12, "Black"));
		
		System.out.println(cp1.isMatched());
		System.out.println(cp2.isMatched());
		
		Pair<Chromosome> chromoPair1 = new Pair<>(new Chromosome(), new Chromosome());
		Pair<Chromosome> chromoPair2 = new Pair<>(new Chromosome(), new Chromosome());
		
		/////
		
		
		Pair<Shoe> pair3 = new Pair<>(new Shoe(11, "A"), new Shoe(11, "A"));
		
		
		
	}
}
