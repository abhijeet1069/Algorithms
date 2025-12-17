package skeina.intro;

public class MatrixMultiplication {
	public static int[][] multiply(int[][] a, int[][] b){
		int rowA = a.length;
		int colA = a[0].length;
		
		int rowB = b.length;
		int colB = b[0].length;
		
		if(colA != rowB)
			return null;
		
		int[][] c = new int[rowA][colB];
		
		for(int i = 0; i < rowA; i++) {
			for(int j = 0; j < colB; j++) {
				c[i][j] = 0;
				for(int k = 0; k < rowB; k++)
					c[i][j] += a[i][k] * b[k][j];
			}
		}
		return c;
	}
}
