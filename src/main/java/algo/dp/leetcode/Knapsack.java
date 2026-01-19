package algo.dp.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Returns a subset of nums that sums to target, or an empty list if none exists.
 */
public class Knapsack {
	
	public static List<Integer> subsetSum(int[] nums, int target){
		int n = nums.length;
		boolean[][] dp = new boolean[n+1][target+1];
		
		for(int i = 0; i <= n; i++)
			dp[i][0] = true;
		
		for(int i = 1; i <= n; i++) {
			int val = nums[i-1];
			for(int s = 1; s <= target; s++) {
				dp[i][s] = dp[i-1][s];
				
				if(s >= val && dp[i-1][s-val])
					dp[i][s] = true;
			}
		}
		
		//target not achievable
		if(!dp[n][target])
			return new ArrayList<>();
		
		List<Integer> subset = new ArrayList<>();
		int s = target;
		int i = n;
		
		while(i > 0 && s > 0) {
			if(dp[i-1][s])
				i--;
			else {
				subset.add(nums[i-1]);
				s -= nums[i-1];
				i--;
			}
		}
		
		return subset;
	}
	
	public static void main(String[] args) {
		int[] S = {1, 2, 5};
        int T = 6;
        
        System.out.println(subsetSum(S,T));
	}

}
