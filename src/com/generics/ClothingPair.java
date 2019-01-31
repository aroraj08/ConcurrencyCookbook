package com.generics;

public class ClothingPair<E extends Sized> extends Pairs<E> {

	public ClothingPair(E left, E right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public boolean isMatched() {
		return this.getLeft().getSize() == this.getRight().getSize();
	}

	
	//public static boolean matched(F left, F right) {} // F Can not be resolved to a type.
	
	//public static boolean matched(E left, E right) {} // Can not make a static reference to a non-static type.
	
	// this is the correct behavior.
	public static <F extends Sized> boolean matched1(F left, F right) {
		
		return left.getSize() == right.getSize();
	}
}
