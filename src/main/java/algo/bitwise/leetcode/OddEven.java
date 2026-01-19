package algo.bitwise.leetcode;

public class OddEven {
	
	/**For even numbers LSB = 0*/
	public static boolean isEven(int n) {
		return (n & 1) == 0;
	}
}
