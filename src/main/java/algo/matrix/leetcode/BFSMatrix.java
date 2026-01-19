package algo.matrix.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * You are given an image represented by an m x n grid of integers image, where image[i][j] represents the pixel value
 * of the image. You are also given three integers sr, sc, and color. Your task is to perform a flood fill on the image starting from the pixel image[sr][sc].
 *
 * To perform a flood fill:
 *
 * Begin with the starting pixel and change its color to color.
 * Perform the same process for each pixel that is directly adjacent (pixels that share a side with the original pixel,
 * either horizontally or vertically) and shares the same color as the starting pixel.
 * Keep repeating this process by checking neighboring pixels of the updated pixels and modifying their color if it
 * matches the original color of the starting pixel.
 * The process stops when there are no more adjacent pixels of the original color to update.
 * Return the modified image after performing the flood fill.
 *
 * Example 1:
 *
 * Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
 *
 * Output: [[2,2,2],[2,2,0],[2,0,1]]
 * */

public class BFSMatrix {
    static int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int origColor = image[sr][sc];
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{sr,sc});
        visited[sr][sc] = true;

        while(!q.isEmpty()){
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];

            image[r][c] = color;

            for(int[] d : dirs){
                int nr = r+d[0];
                int nc = c+d[1];
                if(nr>=0 && nr<m &&
                    nc>=0 && nc<n &&
                    image[nr][nc]==origColor &&
                    !visited[nr][nc]){
                        visited[nr][nc] = true;
                        q.offer(new int[]{nr,nc});
                }
            }
        }
        return image;
    }
}
