package algo.matrix.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToeplitzMatrixTest {

    @Test
    void isToeplitzMatrix1() {
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        assertTrue(new ToeplitzMatrix().isToeplitzMatrix(matrix));
    }

    @Test
    void isToeplitzMatrix2() {
        int[][] matrix = {{1,2},{2,2}};
        assertFalse(new ToeplitzMatrix().isToeplitzMatrix(matrix));
    }

    @Test
    void isToeplitzMatrix3() {
        int[][] matrix = {{11,74,0,93},{40,11,74,7}};
        assertFalse(new ToeplitzMatrix().isToeplitzMatrix(matrix));
    }
}