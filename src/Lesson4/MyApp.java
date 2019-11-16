package Lesson4;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
				
		
				for (int i = 1; i < b; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print("*");
					}
					System.out.print("\n");
				}

				for (int i = b; i > 0; i--) {
					for (int j = 1; j <= i; j++) {
						System.out.print("*");
					}
					System.out.print("\n");
				}

	}

}
