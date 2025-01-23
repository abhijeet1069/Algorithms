package algorithm.c1.s1.exercises;

public class Histogram {

	/**
	 * returns an array of length M whose ith entry is the number of times the integer 
	 * i appeared in the argument array. I
 * */	
	
	private static int[] histogram(int arr[], int M) {
		int[] res = new int[M];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < M)
				res[arr[i]]++;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arr[] = {0,12,3,1,2,3,4,5,22,34,21,23,1,0};
		int M = 5;
		int[] res = histogram(arr,M);
		
		// OP - 2 2 1 2 1 
		for(int x : res)
			System.out.print(x+" ");
	}
}
