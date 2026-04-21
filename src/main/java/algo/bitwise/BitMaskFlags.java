package algo.bitwise.leetcode;

/** Bit mask flags are mostly used in file permissions
 * Here its X-W-R
 * */
public class BitMaskFlags {
	static final int READ = 1<<0;
	static final int WRITE= 1<<1;
	static final int EXEC = 1<<2;
	
	public static boolean isWritable(int perms) {
		return (perms & WRITE) != 0;
	}
}
