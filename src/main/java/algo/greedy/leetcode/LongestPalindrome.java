package algo.greedy.leetcode;

import java.util.HashMap;

/**
 * Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome
 * that can be built with those letters.
 *
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome.
 *
 * Example 1:
 * Input: s = "abccccdd"
 * Output: 7
 * Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 * */

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        HashMap<Character,Integer> freqMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){ //build frequency map
            char ch = s.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch,0)+1);
        }

        boolean isOdd = false;
        int count = 0;
        for(char ch : freqMap.keySet()){
            int freq = freqMap.get(ch);
            if((freq&1) == 1){ //if freq is odd
                count += freq-1;
                isOdd = true;
            }
            else
                count += freq;
        }
        if(isOdd)
            return count+1;
        else
            return count;
    }
}
