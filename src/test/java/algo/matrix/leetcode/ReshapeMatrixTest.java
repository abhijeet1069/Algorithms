package algo.matrix.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReshapeMatrixTest {

    @Test
    void get1dMatrixA() {
        int[][] mat = {{1,2},{3,4}};
        int[] res = {1,2,3,4};
        assertArrayEquals(res,new ReshapeMatrix().get1dMatrix(mat));
    }

    @Test
    void get1dMatrixB() {
        int[][] mat = {{1,2,4,3},{3,4,5,6},{2,3,4,5}};
        int[] res = {1,2,4,3,3,4,5,6,2,3,4,5};
        assertArrayEquals(res,new ReshapeMatrix().get1dMatrix(mat));
    }

    @Test
    void get2dMatrixA() {
        int[] mat = {1,2,4,3,3,4,5,6,2,3,4,5};
        int[][] res = {{1,2,4,3},{3,4,5,6},{2,3,4,5}};
        assertArrayEquals(res,new ReshapeMatrix().get2dMatrix(mat,3,4));
    }

    @Test
    void get2dMatrixB() {
        int[] mat = {1,2,3,4};
        int[][] res = {{1,2},{3,4}};
        assertArrayEquals(res,new ReshapeMatrix().get2dMatrix(mat,2,2));
    }

    @Test
    void matrixReshapeA() {
        int[][] mat = {{1,2},{3,4}};
        int[][] res = {{1,2,3,4}};
        assertArrayEquals(res,new ReshapeMatrix().matrixReshape(mat,1,4));
    }

    @Test
    void matrixReshapeB() {
        int[][] mat = {{1,2},{3,4}};
        assertArrayEquals(mat,new ReshapeMatrix().matrixReshape(mat,2,4));
    }
}