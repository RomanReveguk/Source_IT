package Lesson14.hw13_Task4;

import java.util.Arrays;
import java.util.Random;

/* Задание 4
Распараллелить задачу поиска максимального значения в матрице MxN 
при помощи M потоков. Каждую операцию сравнения снабдить задержкой в 1 мс. 
Создать и заполнить матрицу 4x100 случайными числами.
Дополнительно решить задачу поиска максимального значения без распараллеливания. 
Вывести результат и время выполнения кода для двух вариантов.
*/

public class HW13_Task4_Main {

	public static void main(String[] args) {
		Random random = new Random();
		int m = 4;
		int n = 100;
		int[][] matrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = random.nextInt(1000 - 1) + 1;
			}
		}
		for (int i = 0; i < m; i++) {
			System.out.println(Arrays.toString(matrix[i])); 
		}
		long startTime = System.nanoTime();

		int max = new HW13_Task4_SingleMax().foriMaxDetermination(matrix);
		long endTime = System.nanoTime();

		System.out.println("Max: " + max + ". Time for finding Max value by single \"for i\" method: "
				+ ((endTime - startTime) / 1000) + " ms;");

		long startTime2 = System.nanoTime();
		int max2 = new HW13_Task4_MultithreadingMax().multithreadinMaxDetermination(matrix);
		long endTime2 = System.nanoTime();

		System.out.println("Max: " + max2 + ". Time for finding Max value by multithreading method: "
				+ ((endTime2 - startTime2) / 1000) + " ms;");

	}

}