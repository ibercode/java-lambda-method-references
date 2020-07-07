package com.ibercode.ArbitraryObjectParticularClassMethodReference.ex3;

import java.util.function.Function;

public class App {

	public static void main(String[] args) {
		
		ProductUtils productUtils = new ProductUtils();
		Product product = new Product(175.2, productUtils );

		//FI = Lambda Expression
		Function<Product, Integer> sales1 = p -> p.getDiscount();
		sales1.apply(product);
		
		//FI = Method Reference 
		Function<Product, Integer> sales = Product::getDiscount;
		Integer discount = sales.apply(product);
		
		System.out.println("Discount " + discount);
		
	}
}
