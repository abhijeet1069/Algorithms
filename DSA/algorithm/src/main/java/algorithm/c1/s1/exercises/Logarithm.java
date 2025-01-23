package algorithm.c1.s1.exercises;

public class Logarithm {
	private static final double LOGE2 = 0.6931471805599453;
	
	public static int log2(int num) { 
		if (num <= 0)
			throw new IllegalArgumentException("Input must be positive");  
		int res = 0;
		while(num > 1) {
			res++;
			num = num/2;
		}
		return res;
	}
}
