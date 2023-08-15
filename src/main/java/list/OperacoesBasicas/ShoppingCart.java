package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ShoppingCart {
	
	List<Item> itemList;

	public ShoppingCart() {
		this.itemList = new ArrayList<>();
	}
	
	public void addItem(String name, double price, int quantity) {
		Item item = new Item(name, price, quantity);
		itemList.add(item);
	}
	
	public void removeItem(String name) {
		List<Item> removeList = new ArrayList<>();
		for (Item i : itemList) {
			if (i.getName().equalsIgnoreCase(name)) {
				removeList.add(i);
			}
		}
		itemList.removeAll(removeList);
	}
	
	public int totalItems() {
		return itemList.size();
	}
	
	public double totalValue() {
		double sum = 0;
		for (Item i : itemList) {
			sum += i.getPrice();
		}
		return sum;
	}

	public void showItems() {
		System.out.println(itemList);
	}
	
	
	
	
	public static void main(String[] args) {
		ShoppingCart sc = new ShoppingCart();
		sc.addItem("TV", 500.00, 2);
		sc.addItem("Hoverboard", 750.00, 5);
		sc.addItem("Iphone", 1500.00, 6);
		sc.addItem("Laptop", 900.00, 4);
		System.out.println(sc.totalItems());
		System.out.println("******************");
		sc.removeItem("TV");
		System.out.println(sc.totalItems());
		sc.showItems();
		System.out.println("Total cart value = $" + sc.totalValue());
	}
}
