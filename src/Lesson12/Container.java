package Lesson12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Container {
	public final static String STR = "a";
	public final static String STB = "b";
	public final static int NUMBER_100 = 100;
	public final static int NUMBER_10_000 = 10000;
	public final static int NUMBER_1_000_000 = 1000000;

	static List<String> list = new ArrayList<String>();
	static LinkedList<String> linkedlist = new LinkedList<String>();

	public static void insertInTheBegin(int number) {
		for (int i = 0; i < number; i++) {
			list.add(i, STB);
		}
	}

	public static void insertInTheEnd(int number) {
		for (int i = 0; i < number; i++) {
			list.add(STB);
		}
	}

	public static void insertInTheMiddle(int number) {
		for (int i = 0; i < number; i++) {
			list.add((list.size() - 1) / 2, STB);
		}

	}

	public static void removeInTheBegin(int count) {
		for (int i = 0; i < count; i++) {
			list.remove(0);
		}
	}

	public static void removeInTheEnd(int count) {
		for (int i = 0; i < count; i++) {
			list.remove(list.size() - 1);

		}
	}

	public static void removeInTheMiddle(int count) {
		for (int i = 0; i < count; i++) {
			list.remove((list.size()) / 2);

		}
	}
	/////////////////////////////////////////////////////////////////////////////////////////

	public static void insertInTheBeginLinked(int number) {
		for (int i = 0; i < number; i++) {
			linkedlist.addFirst(STB);
		}
	}

	public static void insertInTheEndLinked(int number) {
		for (int i = 0; i < number; i++) {
			linkedlist.addLast(STB);
		}
	}

	public static void insertInTheMiddleLinked(int number) {
		for (int i = 0; i < number; i++) {
			linkedlist.add((linkedlist.size() - 1) / 2, STB);
		}

	}

	public static void removeInTheBeginLinked(int count) {
		for (int i = 0; i < count; i++) {
			linkedlist.pollFirst();
		}
	}

	public static void removeInTheEndLinked(int count) {
		for (int i = 0; i < count; i++) {
			linkedlist.pollLast();
		}
	}

	public static void removeInTheMiddleLinked(int count) {
		for (int i = 0; i < count; i++) {
			linkedlist.remove((linkedlist.size() - 1) / 2);

		}
	}

	public static void main(String[] args) {

		for (int i = 0; i < NUMBER_1_000_000; i++) {
			linkedlist.add(STR);
		}

		System.out.println(linkedlist.size());

		long mill = System.currentTimeMillis();

		Container.insertInTheBeginLinked(NUMBER_1_000_000);

		long delta = System.currentTimeMillis() - mill;
		System.out.println(delta);

	}
}