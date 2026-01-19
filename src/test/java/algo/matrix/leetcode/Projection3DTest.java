package algo.matrix.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Projection3DTest {

    @Test
    void projectionArea1() {
        int[][] grid = {{1,2},{3,4}};
        assertEquals(17,new Projection3D().projectionArea(grid));
    }

    @Test
    void projectionArea2() {
        int[][] grid = {{2}};
        assertEquals(5,new Projection3D().projectionArea(grid));
    }

    @Test
    void projectionArea3() {
        int[][] grid = {{1,0},{0,2}};
        assertEquals(8,new Projection3D().projectionArea(grid));
    }
}