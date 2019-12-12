package Lesson11;

public interface MyList {

	void addd(Object e);
	void clear();
	boolean remove(Object o); // removes the first occurrence of the specified element from this list
	Object[] toArray(); // returns an array containing all of the elements in this list in proper sequence
	int size(); // returns the number of elements in this list
	boolean contains(Object o); // returns true if this list contains the specified element.
	boolean containsAll(MyList c); // returns true if this list contains all of the elements of the specified list	
}
