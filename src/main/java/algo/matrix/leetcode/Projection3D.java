package algo.matrix.leetcode;

public class Projection3D {
    public int projectionArea(int[][] grid) {
        return getXYProj(grid)+getXZProj(grid)+getYZProj(grid);
    }

    private int getXYProj(int[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0;j < col; j++){
                if(grid[i][j] > 0)
                    count++;
            }
        }
        return count;
    }

    private int getXZProj(int[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i = 0; i < row; i++){
            int temp = 0;
            for(int j = 0; j < col; j++){
                temp = Math.max(temp,grid[i][j]);
            }
            count += temp;
        }
        return count;
    }

    private int getYZProj(int[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i = 0; i < col; i++){
            int temp = 0;
            for(int j = 0; j < row; j++){
                temp = Math.max(temp,grid[j][i]);
            }
            count += temp;
        }
        return count;
    }
}
