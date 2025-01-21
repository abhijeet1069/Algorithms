package algorithm.c1Fundamentals.s1programmingModel.theory.array;

public class AverageOfArray {
	
	public double average(int[] arr) {
		if(arr == null)
			throw new IllegalArgumentException("Input array cannot be null");
		if(arr.length == 0)
			throw new IllegalArgumentException("Input array cannot have zero length");
		
		int N = arr.length;
		double sum = 0.0;
		for(int i = 0; i < N; i++)
			sum += arr[i];
		double avg = sum/N;
		return avg;
	}
}
