package main.java.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class ProductRegister {

	private Set<Product> productSet;

	public ProductRegister() {
		this.productSet = new HashSet<>();
	}
	
	public void addProduct(Long code, String name, double price, int quantity) {
		productSet.add(new Product(code, name, price, quantity));
	}
	
	public Set<Product> searchByName(String name){
		Set<Product> productByName = new TreeSet<>();
		if (!productSet.isEmpty()) {
			for (Product p : productSet) {
				if (p.getName().equalsIgnoreCase(name)) {
					productByName.add(p);
				}
			}
		}
		return productByName;
	}
	
	public Set<Product> orderByName(){
		Set<Product> setByName = new TreeSet<>(productSet);
		return setByName;
	}
	
	public Set<Product> orderByPrice(){
		Set<Product> setByPrice = new TreeSet<>(new ComparatorByPrice());
		setByPrice.addAll(productSet);
		return setByPrice;
	}
	
	public static void main(String[] args) {
		ProductRegister pr = new ProductRegister();
		
		pr.addProduct(1L, "TV", 1250.0, 5);
		pr.addProduct(5L, "Bicycle", 500.0, 4);
		pr.addProduct(2L, "Iphone", 1000.0, 8);
		pr.addProduct(3L, "Radio", 120.0, 6);
		
		System.out.println(pr.searchByName("TV"));
		System.out.println(pr.orderByName());
		System.out.println(pr.orderByPrice());
	}
	
}
