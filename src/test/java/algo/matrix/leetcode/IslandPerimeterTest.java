package algo.matrix.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IslandPerimeterTest {

    @Test
    void islandPerimeter1() {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        assertEquals(16,new IslandPerimeter().islandPerimeter(grid));
    }

    @Test
    void islandPerimeter2() {
        int[][] grid = {{1}};
        assertEquals(4,new IslandPerimeter().islandPerimeter(grid));
    }

    @Test
    void islandPerimeter3() {
        int[][] grid = {{1,0}};
        assertEquals(4,new IslandPerimeter().islandPerimeter(grid));
    }
}