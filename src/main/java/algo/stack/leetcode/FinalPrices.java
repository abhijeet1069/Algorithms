package algo.stack.leetcode;

import java.util.Stack;

public class FinalPrices {

    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            while (!stack.empty() && prices[i] <= prices[stack.peek()]) {
                int idx = stack.pop();
                res[idx] = prices[idx] - prices[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int idx = stack.pop();
            res[idx] = prices[idx];
        }
        return res;
    }
}
