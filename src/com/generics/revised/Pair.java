package com.generics.revised;


/**
 * @author jatarora0
 *
 * @param <E> E represents pair of socks, shoes, gloves, words, chromosomes
 */
public class Pair<E /*extends Clothable*/> {

	private E left;
	private E right;
	
	public Pair(E left, E right) {
		this.left = left;
		this.right = right;
	}

	
	public boolean isMatched() {
		return false;
	//return (left.getColor().equalsIgnoreCase(right.getColor()) && (left.getSize() == right.getSize()));
	}
	
	
	E getLeft() {
		return left;
	}
	void setLeft(E left) {
		this.left = left;
	}
	E getRight() {
		return right;
	}
	void setRight(E right) {
		this.right = right;
	}
	
	
}
