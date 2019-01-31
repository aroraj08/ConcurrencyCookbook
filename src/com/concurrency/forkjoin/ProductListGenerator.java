package com.concurrency.forkjoin;

import java.util.ArrayList;
import java.util.List;

public class ProductListGenerator {

	public List<Product> generate(int number) {
		List<Product> productList = new ArrayList<>();
		
		for (int i=0; i< number; i++) {
			Product product = new Product();
			product.setName("Product " + i);
			product.setPrice(10);
			productList.add(product);
		}
		return productList;
	}
}
