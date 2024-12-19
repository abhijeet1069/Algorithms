package com.satyam.algorithm.fundamentals.programmingModel.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Fibonacci {
	//Got till 50 and taking a long time
	public static long F(int N) {
		if(N == 0)
			return 0;
		if(N == 1)
			return 1;
		return F(N-1)+F(N-2);
	}
	
	//Not space optimized but went till 100 in a button click
	public static long Fib(int N) {
		long[] arr = new long[N+1];
		if(N == 0)
			return 0;
		if(N == 1)
			return 1;
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 2; i < N+1; i++)
			arr[i] = arr[i-1] + arr[i-2];
		return arr[N];
	}
	
	public static void main(String[] args) {
		for(int N = 0; N < 100; N++)
			StdOut.println(N+" "+Fib(N));
	}

}
