package com.satyam.algorithm.fundamentals.programmingModel.theory.array;

public class ReverseOfArray {
	
	public void reverse(double[] arr) {
		int N = arr.length;
		for(int i = 0; i < N/2; i++) {
			double temp = arr[i];
			arr[i] = arr[N-1-i];
			arr[N-i-1] = temp;
		}
	}
}
