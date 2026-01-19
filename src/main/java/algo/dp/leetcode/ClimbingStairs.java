package algo.dp.leetcode;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 *
 * */
public class ClimbingStairs {

    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return helper(n, memo);
    }

    private int helper(int n, int[] memo){
        if(n == 0 || n == 1)
            return 1;
        if(memo[n] != 0)
            return memo[n];
        memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
        return memo[n];
    }
}
