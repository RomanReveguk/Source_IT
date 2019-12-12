package Lesson11new;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DefaultMyList<E> implements MyList<E>, ListIterable<E> {

	private E[] values;
	private int size;

	@SuppressWarnings("unchecked")
	public DefaultMyList() {
		values = (E[]) new Object[0];
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(E e) {
		try {
			E[] temp = values; // создаем временный массив и все что в temp копируем в валс
			values = (E[]) new Object[temp.length + 1]; //
			System.arraycopy(temp, 0, values, 0, temp.length); // коппируем из темпа с нулевого елем. в валес с нулевого
																// елем. и сколько елементов
			values[values.length - 1] = e;
			return true;
		} catch (ClassCastException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		values = (E[]) new Object[0];
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean remove(int index) {
		E[] temp = values;
		values = (E[]) new Object[temp.length - 1];
		System.arraycopy(temp, 0, values, 0, index); // скопировали все елементы которые идут до индекса который мы
														// хотим удалить
		int amountElemAfterIndex = temp.length - index - 1; // кколв елементов после индекса
		System.arraycopy(temp, index + 1, values, index, amountElemAfterIndex); // скопировали все елементы которые идут
																				// после индекса который мы хотим
																				// удалить
		return true;
	}

	@Override
	public E[] toArray() {
		// return values;
		size = size();
		return Arrays.copyOf(values, size);
	}

	@Override
	public int size() {
		return values.length;
	}

	@Override
	public boolean contains(E o) {
		for (int i = 0; i < values.length; i++) {
			if ((values[i] == o)) {
				return true;
			}

		}
		return false;
	}

	@Override
	public E get(int index) {
		return values[index];
	}

	@Override
	public boolean containsAll(MyList<E> c) {
		E[] mylistArray = c.toArray();
		for (int i = 0; i < mylistArray.length; i++) {
			if (!(contains(mylistArray[i])))
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "DefaultMyList [values=" + Arrays.toString(values) + ", iterator()=" + iterator() + "]";
	}

	////////////////////////////////// ITERATOR///////////////////////////////////////////////////////

	@SuppressWarnings("hiding")
	private class IteratorImpl<E> implements Iterator<Object> {

		private int index = 0;
		private E[] values;
		int cursor;
		@SuppressWarnings("unused")
		int lastRet = -1;

		IteratorImpl(E[] values) {
			this.values = values;
		}

		@Override
		public boolean hasNext() {
			// return index < values.length;
			return cursor != values.length;
		}

		@SuppressWarnings("unchecked")
		@Override
		public E next() {
			int i = cursor;
			if (i < size)
				throw new NoSuchElementException();
			Object[] values = DefaultMyList.this.values;
			if (i >= values.length)
				throw new ConcurrentModificationException();
			cursor = i + 1;
			return (E) values[lastRet = i];
			// return values[index++];

		}

		@SuppressWarnings("unchecked")
		public void remove() {
			E[] temp = values;
			E me = values[index];
			values = (E[]) new Object[temp.length - 1];
			System.arraycopy(temp, 0, values, 0, (int) me);

			int amountElemAfterIndex = temp.length - (int) me - 1;
			System.arraycopy(temp, (int) me + 1, values, (int) me, amountElemAfterIndex);
		}
	}

	@Override
	public Iterator<Object> iterator() {
		return new IteratorImpl<>(values);
	}

	
//////////////////////////////////LIST_ITERATOR///////////////////////////////////////////////////////
	
	@SuppressWarnings("hiding")
	private class ListIteratorImpl<E> extends IteratorImpl<E> implements ListIterator {
		private int cursor = 0;
		private int cursor2 = values.length - 1;

		ListIteratorImpl(E[] values) {
			super(values);
		}

		@Override
		public boolean hasNext() {
			return cursor < values.length;
		}

		@SuppressWarnings("unchecked")
		@Override
		public E next() {
			return (E) values[cursor++];

		}

		@Override
		public boolean hasPrevious() {
			if (!(cursor2 == -1))
				return true;
			return false;
		}

		@SuppressWarnings("unchecked")
		@Override
		public E previous() {
			return (E) values[cursor2--];
		}

		@SuppressWarnings("unchecked")
		@Override
		public void set(Object e) {

			if (lastRet < 0)
				throw new IllegalStateException();
			 values[lastRet] =e;
		}

		@Override
		public void remove() {
			if (lastRet < 0)
				throw new IllegalStateException();
			if (lastRet >= size)
				throw new IndexOutOfBoundsException();

			int numMoved = size - lastRet - 1;
			if (numMoved > 0)
				System.arraycopy(values, lastRet + 1, values, lastRet, numMoved);
			values[--size] = null;
			cursor = lastRet;
			lastRet = -1;

		}

	}

	public ListIterator listIterator() {
		return new ListIteratorImpl<>(values);
	}

}
