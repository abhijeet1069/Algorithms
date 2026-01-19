package algo.matrix.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlippingAnImageTest {

    @Test
    void flipAndInvertImage1() {
        int[][] img = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] res = {{1,0,0},{0,1,0},{1,1,1}};

        assertArrayEquals(res,new FlippingAnImage().flipAndInvertImage(img));
    }

    @Test
    void flipAndInvertImage2() {
        int[][] img = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] res = {{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}};

        assertArrayEquals(res,new FlippingAnImage().flipAndInvertImage(img));
    }
}