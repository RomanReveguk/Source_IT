package Dz;

public class MassRandom {

	public static void main(String[] args) {
		int[] array = new int[10];
		System.out.println("Первый массив длиной 10:");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
			System.out.print(array[i] + ". ");
		}

		System.out.println();

		int[] array2 = new int[20];
		System.out.println("Второй массив длиной 20:");
		for (int i = 0; i < array2.length; i++) {

			if (i < 10) {
				array2[i] = array[i];
				System.out.print(array2[i] + ". ");
			} else {
				array2[i] = array[i - 10] * 2;
				System.out.print(array2[i] + ". ");

			}

		}

	}

}
