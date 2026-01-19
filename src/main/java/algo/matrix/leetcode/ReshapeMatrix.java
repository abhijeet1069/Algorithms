package algo.matrix.leetcode;

/**
 * In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a
 * different size r x c keeping its original data.
 *
 * You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of
 * columns of the wanted reshaped matrix.
 *
 * The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing
 * order as they were.
 *
 * If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise,
 * output the original matrix.
 *
 * Input: mat = [[1,2],[3,4]], r = 1, c = 4
 * Output: [[1,2,3,4]]
 *
 * Input: mat = [[1,2],[3,4]], r = 2, c = 4
 * Output: [[1,2],[3,4]]
 * */

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] res = mat.clone();
        if(m*n == r*c) {
            int[] mat1D = get1dMatrix(mat);
            res = get2dMatrix(mat1D, r, c);
        }
        return res;
    }

    public int[] get1dMatrix(int[][] mat){
        int row = mat.length;
        int col = mat[0].length;
        int[] res = new int[row*col];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i*col + j] = mat[i][j];
            }
        }
        return res;
    }

    public int[][] get2dMatrix(int[] mat, int row, int col){
        int[][] res = new int[row][col];
        for(int i = 0; i < mat.length; i++){
            res[i/col][i%col] = mat[i];
        }
        return res;
    }
}
