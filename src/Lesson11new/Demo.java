package Lesson11new;

import java.util.Iterator;

public class Demo<E> extends DefaultMyList<E> {

	public static void main(String[] args) {

		DefaultMyList<String> list = new DefaultMyList<String>();

		list.add("Tom");
		list.add("Alice");
		list.add("Kate");
		list.add("Bob");
		list.add("Roman");
		list.add("Dima");

		System.out.println("Размер list " + list.size());
		list.remove(0);
		System.out.println("Размер листа после удаление 0го елемента " + list.size());

		boolean k = list.contains("Dima");
		System.out.println("Содержится ли ,,Дима,, в list " + k);
		System.out.println("Очищаем лист с помощью clear ");
		list.clear();
		System.out.println("Получаем размер листа после очистки = " + list.size());

		// For toArray
		DefaultMyList<Integer> al = new DefaultMyList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Object[] objects = al.toArray();

		// Printing array of objects
		for (Object obj : objects)
			System.out.print(obj + ", ");

		DefaultMyList<String> c = new DefaultMyList<String>();
		c.add("Tom");
		c.add("Alice");

		System.out.println("Содержит ли list елементы листа с " + list.containsAll(c));

		System.out.println(c.size());

		System.out.println();

		// ITERATOR Продемонстрировать работу итератора
		System.out.println("Продемонстрировать работу итератора  iterator ");
		DefaultMyList<String> list2 = new DefaultMyList<String>();

		list2.add("Roman");
		list2.add("Dima");
		list2.add("Dima");
		for (Object o : list2) {
			System.out.println(o);
		}
		System.out.println();

		Iterator<Object> it = list2.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// listIterator   Продемонстрировать работу итератора 
		
		System.out.println("Продемонстрировать работу итератора  listIterator ");

		ListIterator listIter = list2.listIterator();

		while (listIter.hasPrevious()) {
			System.out.println(listIter.previous());
		}

		listIter.remove();

	}
}
