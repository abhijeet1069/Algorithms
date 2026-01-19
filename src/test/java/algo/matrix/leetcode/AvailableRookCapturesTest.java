package algo.matrix.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvailableRookCapturesTest {

    @Test
    void numRookCaptures1() {
        char[][] board =   {{'.','.','.','.','.','.','.','.'},
                            {'.','.','.','p','.','.','.','.'},
                            {'.','.','.','p','.','.','.','.'},
                            {'p','p','.','R','.','p','B','.'},
                            {'.','.','.','.','.','.','.','.'},
                            {'.','.','.','B','.','.','.','.'},
                            {'.','.','.','p','.','.','.','.'},
                            {'.','.','.','.','.','.','.','.'}};

        assertEquals(3, new AvailableRookCaptures().numRookCaptures(board));
        
    }

    @Test
    void numRookCaptures2() {
        char[][] board =   {{'.','.','.','.','.','.','.','.'},
                            {'.','p','p','p','p','p','.','.'},
                            {'.','p','p','B','p','p','.','.'},
                            {'.','p','B','R','B','p','.','.'},
                            {'.','p','p','B','p','p','.','.'},
                            {'.','p','p','p','p','p','.','.'},
                            {'.','.','.','.','.','.','.','.'},
                            {'.','.','.','.','.','.','.','.'}};

        assertEquals(0, new AvailableRookCaptures().numRookCaptures(board));

    }

    @Test
    void numRookCaptures3() {
        char[][] board =   {{'.','.','.','.','.','.','.','.'},
                            {'.','.','.','p','.','.','.','.'},
                            {'.','.','.','p','.','.','.','.'},
                            {'p','p','.','R','.','p','B','.'},
                            {'.','.','.','.','.','.','.','.'},
                            {'.','.','.','B','.','.','.','.'},
                            {'.','.','.','p','.','.','.','.'},
                            {'.','.','.','.','.','.','.','.'}};

        assertEquals(3, new AvailableRookCaptures().numRookCaptures(board));

    }
}