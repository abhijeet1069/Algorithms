package algo.matrix.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransposeMatrixTest {

    @Test
    void transpose1() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] transpose =  {{1,4,7},{2,5,8},{3,6,9}};
        assertArrayEquals(transpose, new TransposeMatrix().transpose(matrix));
    }

    @Test
    void transpose2() {
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] transpose =  {{1,4},{2,5},{3,6}};
        assertArrayEquals(transpose, new TransposeMatrix().transpose(matrix));
    }
}