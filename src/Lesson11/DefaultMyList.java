package Lesson11;

import java.util.Arrays;

public class DefaultMyList implements MyList {


	@Override
	public void addd(Object e) {

	}

	@Override
	public void clear() {

	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		return false;
	}

	@Override
	public String toString() {
		return "DefaultMyList [toArray()=" + Arrays.toString(toArray()) + ", toString()=" + super.toString() + "]";
	}

}
