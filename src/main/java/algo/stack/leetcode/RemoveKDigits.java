package algo.stack.leetcode;

import java.util.Stack;

/**
 * Given string num representing a non-negative integer num, and an integer k, 
 * return the smallest possible integer after removing k digits from num.

	Example 1:
	Input: num = "1432219", k = 3
	Output: "1219"
	Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
	
	Example 2:
	Input: num = "10200", k = 1
	Output: "200"
	Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
	
	Example 3:
	Input: num = "10", k = 2
	Output: "0"
	Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 * */

public class RemoveKDigits {
	
	public String removeKdigits(String num, int k) {
		
		Stack<Character> stack = new Stack<>();
		
		
		
		for(char c : num.toCharArray()) {
			while(!stack.isEmpty() &&
					stack.peek() > c &&
					k > 0) {
				stack.pop();
				k--;
			}
			stack.push(c);
		}
		
		while(k > 0) {
			stack.pop();
			k--;
		}
			
		
		if(stack.isEmpty())
			return "0";
		
		StringBuilder sb = new StringBuilder();
		while (!stack.empty())
			sb.append(stack.pop());

		return removeLeadingZeros(sb.reverse().toString());
    }
	
	private String removeLeadingZeros(String num) {
	    // Replace leading zeros using regular expression
	    String result = num.replaceFirst("^0+(?!$)", "");
	    return result;
	}

}
