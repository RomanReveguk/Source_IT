package Dz;

import java.util.Scanner;

public class Figure {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int j = 0;

		System.out.println("Input max heigth");
		int n = sc.nextInt() * 2;

		for (int i = 0; i < (n - 1);) {

			if (j >= (n / 2 - Math.abs(n / 2 - i))) {
				System.out.println();
				i++;
				j = 0;
			}
			System.out.print("*");
			j++;
		}
		sc.close();
	}
}
