package algo.bitwise.leetcode;

/**
 * a^13 = a^8 * a^4 * a^1
 * 13 = 1101
 * Fast exponentiation has O(lg n), since instead of n loops, 
 * we are using the number of bits used to represent n
 */
public class FastExponentiation {
	public static long power(int a, int n) {
		long res = 1;
	    long base = a;

	    while (n > 0) {
	        if ((n & 1) == 1) {   // if the rightmost bit is 1,  multiply in result
	            res *= base;
	        }
	        base *= base;         // keep on incrementing base for each bit
	        n >>= 1;              // shift bits right
	    }
	    
	    return res;
		
	}
}
