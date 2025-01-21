package algorithm.c1Fundamentals.s1programmingModel.theory.binSearch;

public class BinarySearch {

	public static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length-1;
		while(lo <= hi) {
			int mid = lo+(hi-lo)/2;
			if(key<a[mid])
				hi = mid-1;
			else if(key > a[mid])
				lo = mid+1;
			else
				return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {-1,0,5,12,33,45,66,70,100};
		int key = 5;
		System.out.println(rank(key,arr));
	}
}
