package com.generics;

public class Pairs<E> {

	private E left;
	private E right;
	
	public Pairs(E left, E right) {
		this.left = left;
		this.right = right;
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
