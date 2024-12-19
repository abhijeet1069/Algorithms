package com.satyam.algorithm.fundamentals.programmingModel.theory.array;

public class CopyOfArray {
	
	public double[] copy(double[] arr) {
		int N = arr.length;
		double[] res = new double[N];
		for(int i = 0; i < N; i++)
			res[i] = arr[i];
		return res;
	}
}
