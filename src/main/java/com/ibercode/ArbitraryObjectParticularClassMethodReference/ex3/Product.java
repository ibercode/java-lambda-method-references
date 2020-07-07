package com.ibercode.ArbitraryObjectParticularClassMethodReference.ex3;

public class Product {

	private double price;
	private ProductUtils pu;

	public Product(double price, ProductUtils pu) {
		super();
		this.price = price;
		this.pu = pu;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ProductUtils getPu() {
		return pu;
	}

	public void setPu(ProductUtils pu) {
		this.pu = pu;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", pu=" + pu + "]";
	}

	public int getDiscount() {
		return pu.getDiscount(price);
	}

}
