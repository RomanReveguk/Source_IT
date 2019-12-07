package Lesson13;


class MaxNumberAr extends Thread {
	int row = 4;
	int col = 100;

	double[][] matrix = new double[row][col];

	public void createMatrix() {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = (int) (Math.random() * 10);
				System.out.print(matrix[i][j] + "\t");
			}

			System.out.println();
		}

	}

	public void searchMaxElem() {
		System.out.println();

		double max = matrix[0][0];

		for (int i = 0; i < row; i++) {
			for (int j = 1; j < col; j++) {

				if (max < matrix[i][j])
					max = matrix[i][j];
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println(max);
			// обнуляем наши мин и макс и что бы не было ошибки
			if (i + 1 < row) {
				max = matrix[i + 1][0];
			}
		}

	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		createMatrix();
		searchMaxElem();
	}

}

public class MaxNumInArrayNoParallel {
	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			MaxNumberAr tr = new MaxNumberAr();
			try {
			tr.start();
			switch(i) {
			case 0: 
					tr.join();
			case 1: 
				tr.join();
			case 2: 
				tr.join();
			case 3: 
				tr.join();
				}
			}
			
			catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		

		}

	}
