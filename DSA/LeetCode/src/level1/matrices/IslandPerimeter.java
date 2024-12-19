package level1.matrices;

import java.util.ArrayList;
import java.util.List;

public class IslandPerimeter {

	private static List<Integer> getNeighbors(int[][] matrix, int r, int c) {
		int[] mov = new int[] {-1,1};
		int row = matrix.length-1;
		int col = matrix[0].length-1;
		List<Integer> neighbors = new ArrayList<>(4);
		for(int i : mov) {
			if(r+i >= 0 && r+i <= row) 
				neighbors.add(matrix[r+i][c]);
			else
				neighbors.add(-1);
			
			if(c+i >= 0 && c+i <= col)
				neighbors.add(matrix[r][c+i]);
			else
				neighbors.add(-1);
		}
		return neighbors;
	}
	
	public static int islandPerimeter(int[][] grid) {
        return 0;
    }
	
	public static void main(String[] args) {
		int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		//islandPerimeter(grid);
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				System.out.println(i+", "+j);
				System.out.println(getNeighbors(grid,i,j));
			}
		}
	}
}
