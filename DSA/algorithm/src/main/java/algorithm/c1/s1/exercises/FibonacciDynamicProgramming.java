package algorithm.c1.s1.exercises;

import java.util.HashMap;
import java.util.Map;

import edu.princeton.cs.algs4.StdOut;

public class FibonacciDynamicProgramming {
	
	static Map<Integer,Long> map = new HashMap<>();
	
	public static long F(int N)
	{
		if (N == 0) return 0;
		if (N == 1) return 1;
		return F(N-1) + F(N-2);
	}
	
	public static long Fv2 (int N)
	{
		if (N == 0) {
			return 0;
		}
		if (N == 1) 
			return 1;
		
		if(map.containsKey(N))
			return map.get(N);
		else {
			long res = Fv2(N-1) + Fv2(N-2);
			map.put(N,res);
			return res;
		}
	}

	public static void main(String[] args)
	{
		for (int N = 0; N < 100; N++)
			StdOut.println(N + " " + F(N));
	}
}
