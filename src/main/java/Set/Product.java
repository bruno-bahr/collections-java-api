package main.java.Set;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product>{
	
	private Long code;
	private String name;
	private double price;
	private int quantity;
	
	public Product(Long code, String name, double price, int quantity) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
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
		return "Product [code= " + code + ", " + name + ", US$" + price + ", " + quantity + " units ]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(code, other.code);
	}

	@Override
	public int compareTo(Product p) {
		return name.compareToIgnoreCase(p.getName());
	}
	

}

	class ComparatorByPrice implements Comparator<Product>{
		@Override
		public int compare(Product p1, Product p2) {
			return Double.compare(p1.getPrice(), p2.getPrice());
		}
		
	}
