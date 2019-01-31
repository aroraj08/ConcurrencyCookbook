package com.generics;

import java.time.LocalDate;

public class Store {

	public static void main(String[] args) {
		
		//Pair<String> p = new Pair<>("aa", LocalDate.now());
		/*
		Pair<String> p = new Pair<>("aa", "bb");
		
		String str = (String) p.getLeft();
		String str2 = (String) p.getRight();
		*/
		
		Pair<Shoe> pair1 = new Pair<>(new Shoe(10, "brown"), new Shoe(11, "brown"));
		Pair<Shoe> pair2 = new Pair<>(new Shoe(11, "brown"), new Shoe(11, "brown"));
		
		System.out.println(pair2.isMatched(pair2.getLeft(), pair2.getRight()));
		
	}
}
