package Massive_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate {

	static void printMatrix(int[][] mat) {

		System.out.println("Matrix = ");

		for (int[] row : mat) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();

	}

	static int[][] rotateCW(int[][] mat) {
		final int rowNum = mat.length;
		final int colNum = mat[0].length;

		int[][] ret = new int[rowNum][colNum];
		for (int r = 0; r < rowNum; r++) {
			for (int c = 0; c < colNum; c++) {
				// ret[c][rowNum-1-r] = mat[r][c];
				ret[r][c] = mat[rowNum - c - 1][r];
			}
		}
		return ret;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размер двум.массива ");
		int n = sc.nextInt();
		int mat[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Введите значение элемента матрицы " + "mat[" + i + "][" + j + "]");
				mat[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}

//		   int[][] mat = {
//		        { 1, 2, 3 },
//		        { 4, 5, 6 },
//		        { 7, 8, 9 }
//		    };
		printMatrix(mat);
		// Matrix =
		// [1, 2, 3]
		// [4, 5, 6]
		// [7, 8, 9]

		int[][] matCW90 = rotateCW(mat);
		printMatrix(matCW90);
		// Matrix =
		// [7, 4, 1]
		// [8, 5, 2]
		// [9, 6, 3]

		int[][] matCW180 = rotateCW(matCW90);
		printMatrix(matCW180);

		int[][] matCW270 = rotateCW(matCW180);
		printMatrix(matCW270);

	}

}
