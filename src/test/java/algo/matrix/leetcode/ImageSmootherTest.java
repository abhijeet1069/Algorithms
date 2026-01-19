package algo.matrix.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImageSmootherTest {

    @Test
    void imageSmoother1() {
        int[][] img = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] res = {{0,0,0},{0,0,0},{0,0,0}};

        assertArrayEquals(res, new ImageSmoother().imageSmoother(img));
    }

    @Test
    void imageSmoother2() {
        int[][] img = {{100,200,100},{200,50,200},{100,200,100}};
        int[][] res = {{137,141,137},{141,138,141},{137,141,137}};

        assertArrayEquals(res, new ImageSmoother().imageSmoother(img));
    }
}