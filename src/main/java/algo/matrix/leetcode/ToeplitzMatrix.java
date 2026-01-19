package algo.matrix.leetcode;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i < rows; i++){
            int[] start = {i,0};
            if(!homogenousDiagonal(matrix,start))
                return false;
        }

        for(int i = 1; i < cols; i++){
            int[] start = {0,i};
            if(!homogenousDiagonal(matrix,start))
                return false;
        }
        return true;
    }

    private boolean homogenousDiagonal(int[][] matrix, int[] start){
        int startElement = matrix[start[0]][start[1]];
        for(int i = start[0]+1,j = start[1]+1; i >=0 && i < matrix.length && j>=0 && j < matrix[0].length; i++,j++){
            if(matrix[i][j] != startElement)
                return false;
        }
        return true;
    }


}
