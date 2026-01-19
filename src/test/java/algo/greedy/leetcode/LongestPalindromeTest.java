package algo.greedy.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {

    @Test
    void testLongestPalindrome1() {
        String s = "abccccdd";
        assertEquals(7,new LongestPalindrome().longestPalindrome(s));
    }

    @Test
    void testLongestPalindrome2() {
        String s = "a";
        assertEquals(1,new LongestPalindrome().longestPalindrome(s));
    }
}