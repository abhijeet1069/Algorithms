package com.satyam.algorithm.fundamentals.programmingModel.theory.math;

public class MathUtils {
	
	public static int abs(int x) {
		if(x < 0)
			return -x;
		else
			return x;
	}
	
	public static double abs(double x) {
		if(x < 0)
			return -x;
		else
			return x;
	}

	public static boolean isPrime(int N) {
		if(N < 2)
			return false;
		for(int i = 2; i*i <= N; i++) {
			if(N%i == 0)
				return false;
		}
		return true;
	}

	/**
	 * Square root using newton raphson method
	 * **/
	public static double sqrt(double c) {
		if(c < 0)
			return Double.NaN;
		double err = 1e-15;
		double t = c;
		while(Math.abs(t-c/t) > err*t)
			t = (c/t+t)/2.0;
		return t;
	}
}
