package main.java.Map;

import java.util.HashMap;
import java.util.Map;

public class ContactMap {
	
	private Map<String, Integer> contactMap;

	public ContactMap() {
		this.contactMap = new HashMap<>();
	}
	
	public void addContact(String name, Integer number) {
		contactMap.put(name, number);
	}
	
	public void removeContact(String name) {
		if (!contactMap.isEmpty()) {
			contactMap.remove(name);
		}
	}
	
	public void showContact() {
		System.out.println(contactMap);
	}
	
	public Integer searchByNumber(String name) {
		Integer contact = null;
		if (!contactMap.isEmpty()) {
			contact = contactMap.get(name);
		}
		return contact;
	}
	
	public static void main(String[] args) {
		ContactMap cm = new ContactMap();
		
		cm.addContact("Bruno", 98943465);
		cm.addContact("Breno", 96943195);
		cm.addContact("Juliano", 98934318);
		cm.addContact("Bruna", 98943466);
		cm.addContact("Bruno", 999886132);
		
		cm.showContact();
		
		cm.removeContact("Breno");
		System.out.println("*******************");
		
		cm.showContact();
		
		System.out.println("The number found is: " +  cm.searchByNumber("Bruna"));
		
	}
	

}
