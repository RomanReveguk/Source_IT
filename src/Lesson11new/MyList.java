package Lesson11new;

public interface MyList<E> extends Iterable<Object> {

	boolean add(E e);
	void clear();
	boolean remove(int index); // removes the first occurrence of the specified element from this list
	E[] toArray(); // повертає масив, що містить усі елементи цього списку у правильній послідовності
	int size(); // returns the number of elements in this list
	boolean contains(E o); // повертає true, якщо цей список містить зазначений елемент.
	boolean containsAll(MyList<E> c); // повертає true, якщо цей список містить усі елементи зазначеного списку
	E get(int index);
}
