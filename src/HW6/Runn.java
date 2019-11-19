package HW6;

import java.util.ArrayList;
import java.util.List;

public class Runn {

	public static void main(String[] args) {

		СhocolateCandy one = new СhocolateCandy("Шоколадка", 5, 1100.0, 20, 10);
		СhocolateCandy two = new СhocolateCandy("Сникерс", 4, 500.0, 20, 10);

		Lolipop three = new Lolipop("БимБом", 3.0, 200.0, 20, 10);
		Lolipop four = new Lolipop("Белочка", 2, 150.0, 20, 5);

		List<Sweets> listSweets = new ArrayList<Sweets>();
		listSweets.add(one);
		listSweets.add(two);
		listSweets.add(three);
		listSweets.add(four);

		List<Sweets> listSweets2 = new ArrayList<Sweets>();
		listSweets2.add(one);
		listSweets2.add(two);
		
		Box bigBox = new Box(listSweets);
		Box smallBox = new Box(listSweets2);
		
		System.out.println("отсортируем конфеты по весу: ");
		bigBox.sortWeight();
		System.out.print("Вес подарка равен (кг): ");
		bigBox.countWeight();
		
		System.out.println();

        System.out.println("отсортируем конфеты по весу: ");
		smallBox.sortWeight();
		System.out.print("Вес подарка равен (кг): ");
		smallBox.countWeight();

		System.out.println();
		System.out.println("Найдем конфету по заданому диапазану содержания сахара: ");
		bigBox.sugarContent(0, 500);

	}

}
