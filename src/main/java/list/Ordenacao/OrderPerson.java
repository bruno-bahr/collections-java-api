package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderPerson{
	
	private List<Person> personList;

	public OrderPerson() {
		this.personList = new ArrayList<>();
	}
	

	public void addPerson(String name, int age, double height) {
		Person person = new Person(name, age, height);
		personList.add(person);
	}

	public List<Person> compareAge(){
		List<Person> personByAge = new ArrayList<>(personList);
		Collections.sort(personByAge);
		return personByAge;
	}
	
	public List<Person> orderByHeight(){
		List<Person> personByHeight = new ArrayList<>(personList);
		Collections.sort(personByHeight, new ComparatorByHeight());
		return personByHeight;
	}
	
	public static void main(String[] args) {
		OrderPerson op = new OrderPerson();
		op.addPerson("Bruno", 44, 1.72);
		op.addPerson("Sergio", 56, 1.68);
		op.addPerson("Lucas", 26, 1.82);
		op.addPerson("Jairo", 65, 1.74);
		
		System.out.println(op.compareAge());
		System.out.println("*****************************************************************");
		System.out.println(op.orderByHeight());
	
	}

}
