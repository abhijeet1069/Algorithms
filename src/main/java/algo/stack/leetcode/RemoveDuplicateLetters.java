package algo.stack.leetcode;

import java.util.Stack;

/**
 * Given a string s, remove duplicate letters so that every letter appears once
 * and only once.
 * You must make sure your result is the smallest in lexicographical order among
 * all possible results.
 * 
 * Example 1:
 * Input: s = "bcabc"
 * Output: "abc"
 * 
 * Example 2:
 * Input: s = "cbacdcbc"
 * Output: "acdb"
 */

public class RemoveDuplicateLetters {
	public String removeDuplicateLetters(String s) {
		int[] ctr = new int[26];
		for (int i = 0; i < s.length(); i++)
			ctr[s.charAt(i) - 'a']++;

		boolean[] visited = new boolean[26];
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			ctr[c - 'a']--;
			if (visited[c - 'a'])
				continue;

			while (!stack.isEmpty() && stack.peek() > c && ctr[stack.peek() - 'a'] > 0) {
				visited[stack.pop() - 'a'] = false;
			}
			stack.push(c);
			visited[c - 'a'] = true;
		}

		StringBuilder sb = new StringBuilder();
		while (!stack.empty())
			sb.append(stack.pop());

		return sb.reverse().toString();
	}
}
