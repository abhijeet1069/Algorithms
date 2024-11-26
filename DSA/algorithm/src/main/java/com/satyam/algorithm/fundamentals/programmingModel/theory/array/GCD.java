package com.satyam.algorithm.fundamentals.programmingModel.theory.array;

/**
 * GCD for 2 non-negative integers
 * */
public class GCD {
	public int gcd(int p, int q) {
		int r;
		while(q != 0) {
			r = p%q;
			p = q;
			q = r;
		}
		return p;
	}
}
