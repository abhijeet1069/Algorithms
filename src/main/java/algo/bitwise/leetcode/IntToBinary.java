package algo.bitwise.leetcode;

public class IntToBinary {
	
	/** works only for integers > 0*/
	public static String toBinary(int n) {
		StringBuilder sb = new StringBuilder();
		
		while(n > 0) {
			sb.insert(0,n&1);
			n = n>>1;
		}
		return sb.toString();
	}
	
	/** better, works for every 32 bit number*/
	public static String toBinary32(int n) {
	    StringBuilder sb = new StringBuilder(32);
	    for (int i = 31; i >= 0; i--) {
	        sb.append((n >> i) & 1);
	        
	        if (i % 8 == 0 && i != 0) 
	        		sb.append(' '); // optional spacing by byte
	    }
	    return sb.toString();
	}
}
