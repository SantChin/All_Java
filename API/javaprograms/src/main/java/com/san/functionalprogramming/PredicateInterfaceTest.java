package com.san.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceTest {

	public static void main(String[] args) {

		List<Product> productList = Arrays.asList(new Product("Laptop", 1000.0, 5),
				new Product("Smartphone", 800.0, 10), new Product("Tablet", 500.0, 8),
				new Product("Headphones", 100.0, 20));
		
		 // Predicate to filter expensive products (price > 600)
		Predicate<Product> expensiveProductPredicate = product -> product.getPrice() > 600;
		
		// Predicate to filter products with low stock (quantity < 10)
		Predicate<Product> lowStockProductPredicate = product -> product.getQuantity() < 10;
		
		 // Predicate to filter products with specific name (e.g., "Laptop")
		Predicate<Product> filterProductByNamePredicate = product -> product.getName().equals("Laptop");
		
		
		
		List<Product> expensiceProductList = filterProducts(productList, expensiveProductPredicate);
		System.out.println(expensiceProductList);
		
		
		
		
		
	}
	
	
	
	//UtilityMethod
	private static List<Product> filterProducts(List<Product> productList,Predicate<Product> predicate){
		List<Product> returnList = new ArrayList<Product>();
		
		for(Product product :productList) {
			if(predicate.test(product)) {
				returnList.add(product);
			}
		}	
		return returnList;
	}
	
}

class Product {

	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	
	
}