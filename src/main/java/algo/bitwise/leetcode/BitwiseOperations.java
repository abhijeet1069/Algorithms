package algo.bitwise.leetcode;

public class BitwiseOperations {
	
	public static int getBit(int n, int i) {
		return (n>>i) & 1;
	}
	
	public static int setBit(int n, int i) {
		n = n | (1 << i);
		return n;
	}
	
	public static int clearBit(int n, int i) {
		n = n & ~(1 << i);
		return n;
	}
	
	public static int toggleBit(int n, int i) {
		n = n ^ (1 << i);
		return n;
	}
	
}
