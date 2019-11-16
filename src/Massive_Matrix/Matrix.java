package Massive_Matrix;

public class Matrix {

	public static void main(String[] args) {

		int count = 3;
		double[][] matrix = new double[count][count];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print(matrix[i][j] + "\t");

			}
			System.out.println();
		}
		
		
	
		    public int[][] rotate(int[][] array){
		 
		        int[][] rotateArray = array;
		        int[][] tempArray = new int[][];
		 
		        for (int i = 0; i < rotateArray.length; i++ ){
		 
		            for (int j = 0; j < rotateArray.length; j++){
		 
		                tempArray[i][j] = rotateArray[j][i];
		            }
		        }
		 
		        return rotateArray;
		    }
		

//		// min i max po stroke
//
//		double min = matrix[0][0];
//		double max = matrix[0][0];
//
//		for (int i = 0; i < count; i++) {
//			for (int j = 1; j < count; j++) {
//				if (min > matrix[i][j])
//					min = matrix[i][j];
//				if (max < matrix[i][j])
//					max = matrix[i][j];
//			}
//			System.out.print(min + " ");
//			System.out.println(max);
//			// обнуляем наши мин и макс и что бы не было ошибки
//			if (i + 1 < count) {
//				min = matrix[i + 1][0];
//				max = matrix[i + 1][0];
//			}
//		}

	}

}
