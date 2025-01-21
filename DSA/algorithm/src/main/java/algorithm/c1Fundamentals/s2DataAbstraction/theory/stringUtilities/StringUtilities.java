package algorithm.c1Fundamentals.s2DataAbstraction.theory.stringUtilities;

import edu.princeton.cs.algs4.StdOut;

public class StringUtilities {

	public static boolean isPalindrome(String s) {
		int N = s.length();
		for(int i = 0; i < N/2; i++) {
			if(s.charAt(i) != s.charAt(N-i-1))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		StdOut.println(isPalindrome("abba"));
		StdOut.println(isPalindrome("ssad"));
	}
}
