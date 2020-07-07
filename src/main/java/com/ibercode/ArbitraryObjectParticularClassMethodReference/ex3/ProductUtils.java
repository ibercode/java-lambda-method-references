package com.ibercode.ArbitraryObjectParticularClassMethodReference.ex3;

public class ProductUtils {

	public int getDiscount(double price) {
		if(price > 100) {
			return 30;
		} else {
			return 20;
		}
	}
}
