package algorithm.c1Fundamentals.s1programmingModel.theory.array;

public class MatrixMultiply {

	public double[][] multiply(double[][] a, double[][] b) {
		int N = a.length;
		double[][] c = new double[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++)
					c[i][j] += a[i][k]*b[k][j];
			}
		}
		return c;
	}
}
