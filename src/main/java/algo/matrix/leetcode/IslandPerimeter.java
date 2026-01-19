package algo.matrix.leetcode;

/**
 * You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents
 * water.
 *
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water,
 * and there is exactly one island (i.e., one or more connected land cells).
 *
 * The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island.
 * One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the
 * perimeter of the island.
 *
 * */
public class IslandPerimeter {
    //my solution
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int perimeter = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1){
                    perimeter += getPerimeter(grid,i-1,j);
                    perimeter += getPerimeter(grid,i+1,j);
                    perimeter += getPerimeter(grid,i,j-1);
                    perimeter += getPerimeter(grid,i,j+1);
                }
            }
        }
        return perimeter;
    }

    private int getPerimeter(int[][] grid, int row, int col){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) //out of bounds
            return 1;
        else if(grid[row][col] == 0) //water
            return 1;
        else
            return 0;
    }

    //better optimised solution
    public int islandPerimeter1(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    perimeter += 4;
                    if (r > 0 && grid[r - 1][c] == 1) perimeter -= 2;
                    if (c > 0 && grid[r][c - 1] == 1) perimeter -= 2;
                }
            }
        }
        return perimeter;
    }
}
