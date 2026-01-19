package algo.matrix.leetcode;

public class SurfaceArea3D {
    public int surfaceArea(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int sa = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] > 0)
                    sa += 4*grid[i][j]+2;
                if(i > 0)
                    sa -= Math.min(grid[i][j],grid[i-1][j])*2;
                if(j > 0)
                    sa -= Math.min(grid[i][j],grid[i][j-1])*2;
            }
        }
        return sa;
    }
}
