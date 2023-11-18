package main;

// Class for Product. It implements Decorator design pattern.
public class Product {
	private String name;
	private double price;
	
	public Product(String name, double price) {
	    this.name = name;
	    this.price = price;
	}
	
	public String getName() {
	    return name;
	}
	
	public double getPrice() {
	    return price;
	}
}