package algorithm.c1Fundamentals.s1programmingModel.theory.array;

public class MaxOfArray {
	
	public int max(int[] arr) {
		if(arr == null)
			throw new IllegalArgumentException("Input array cannot be null");
		if(arr.length == 0)
			throw new IllegalArgumentException("Input array cannot have size zero");
		if(arr.length == 1)
			return arr[0];
		
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
}
