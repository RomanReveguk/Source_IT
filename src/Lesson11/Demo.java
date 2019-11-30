package Lesson11;

import java.util.ArrayList;
import java.util.List;

public class Demo extends DefaultMyList {
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Tom");
		list.add("Alice");
		list.add("Kate");
		list.add("Bob");
		list.add("Roman");
		list.add("Dima");

		List<String> list2 = new ArrayList<String>();

		list2.add("Roman");
		list2.add("Dima");
		System.out.println(list.size());

		Object[] listArray = list.toArray();
		for (Object obj : listArray) {
			System.out.print(obj + ", ");
		}

		List<Person> list3 = new ArrayList<Person>();
		list3.add(new Person("Lily"));

		System.out.println(list.contains("Bob"));
		System.out.println(list.remove("Bob"));
		System.out.println(list.contains("Bob"));
		System.out.println(list.containsAll(list2));

		for (Person p : list3) {
			System.out.println(p.getName());
		}

	}

}
class Person {
	private String name;

	public Person(String value) {
		this.name = value;
	}

	String getName() {
		return name;
	}
}

