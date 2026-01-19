package algo.matrix.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurfaceArea3DTest {

    @Test
    void surfaceArea1() {
        int[][] grid = {{1,2},{3,4}};
        assertEquals(34,new SurfaceArea3D().surfaceArea(grid));
    }

    @Test
    void surfaceArea2() {
        int[][] grid = {{1,1,1},{1,0,1},{1,1,1}};
        assertEquals(32,new SurfaceArea3D().surfaceArea(grid));
    }

    @Test
    void surfaceArea3() {
        int[][] grid = {{2,2,2},{2,1,2},{2,2,2}};
        assertEquals(46,new SurfaceArea3D().surfaceArea(grid));
    }
}