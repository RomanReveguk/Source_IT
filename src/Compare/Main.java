package Compare;

import java.util.*;
// Сортировка по обьектам 

class Person {
	int age;

	public Person(int age) {
		this.age = age;
	}

	
	@Override 
	public String toString() {
		return "Person "+age;
	}

}

class ComparePerson implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		return o1.age - o2.age;
	}

}


public class Main {

	public static void main(String[] args) {
		ComparePerson comparePerson = new ComparePerson();
		Set<Person> set = new TreeSet<Person>(comparePerson);
		set.add(new Person(4));
		set.add(new Person(2));
		set.add(new Person(5));

		for (Object o : set) {
			System.out.println(o);

		}
	}

}
