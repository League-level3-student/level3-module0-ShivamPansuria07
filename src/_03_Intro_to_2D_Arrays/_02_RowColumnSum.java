package _03_Intro_to_2D_Arrays;

public class _02_RowColumnSum {
	

	public int getSumByRow(int[][] matrix, int row) {

		int sumRow0=0;
		int[] row1;
		row1 = matrix[row];

		for (int j = 0; j < row1.length; j++) {
			sumRow0 += row1[j];
		}

		return sumRow0;
	}

	public int getSumByColumn(int[][] matrix, int col) {
		int sumCollumn = 0;
		for (int i = 0; i < matrix.length; i++) {
			sumCollumn += matrix[i][col];
		}
		return sumCollumn;
	}
}
