package Lesson13;

class MaxNumber extends Thread {
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

public class MaxNumberInArray {
	public static void main(String[] args) throws InterruptedException {
		long mill = System.currentTimeMillis();
		for (int i = 0; i < 4; i++) {
			MaxNumber tr = new MaxNumber();

			tr.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		long delta = System.currentTimeMillis() - mill;
		System.out.println("Время "+ delta);
		
		
		Thread.sleep(10);
		System.out.println("Без распараллеливания");
		long mill2 = System.currentTimeMillis();
		MaxNumber array =new MaxNumber();
		array.createMatrix();
		array.searchMaxElem();
		long delta2 = System.currentTimeMillis() - mill2;
		System.out.println("Время "+delta2);
	}
}
