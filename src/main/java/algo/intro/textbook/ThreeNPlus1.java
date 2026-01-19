package algo.intro.textbook;

public class ThreeNPlus1 {
	
	public static int getMaxCycleLengthInRange(int low, int high) {
		int max = 0;
		for(int i = low; i <= high; i++)
			max = Math.max(max, getCycleLength(i));
		return max;
	}
	
	static int[] cache = new int[1_000_000];

	public static int getCycleLength(int n) {
		cache[1] = 1;
		int nc = n;
		if (cache[nc] != 0)
			return cache[nc];
		
		int cycleCtr = 1;
		while (nc != 1) {
			if (isEven(nc))
				nc = nc / 2;
			else
				nc = 3*nc+1;
			cycleCtr++;
		}
		cache[n] = cycleCtr;
		return cache[n];
	}

	public static boolean isEven(int n) {
		if ((n & 1) == 0)
			return true;
		else
			return false;
	}
}
