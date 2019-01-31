package com.generics;

public class Pair<E extends Sized> {

	private E left;
	private E right;
	
	public Pair(E left, E right) {
		this.left = left;
		this.right = right;
	}

	public boolean isMatched(E left, E right) {
		return left.getSize() == right.getSize();
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
