package Dz;

import java.util.Scanner;

public class Wallpaper {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите колличество строк(полос):");
		int str = sc.nextInt();
		System.out.println("Введите ширину рисунка:");
		int width = sc.nextInt();
		int count = 0;
		String a = "+++***";

		while (count < str) {
			for (int i = 0; i < width; i++) {
				System.out.print(a);

			}
			System.out.println();
			count++;
		}
		sc.close();
	}
}
