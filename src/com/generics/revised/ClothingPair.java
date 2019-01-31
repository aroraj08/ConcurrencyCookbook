package com.generics.revised;

public class ClothingPair<E extends Clothable> extends Pair<E> {

	public ClothingPair(E left, E right) {
		super(left, right);
	}
	
	public boolean isMatched() {
		//return false;
		return (this.getLeft().getColor().equalsIgnoreCase(this.getRight().getColor()) && (this.getLeft().getSize() == this.getRight().getSize()));
	}
	
	public boolean isSizeMatching(E left, E right) {
		return left.getSize() == right.getSize();
	}
	
	public static <F> boolean isColorMatching(F left, F right) {
		return false;
	}
	
}
