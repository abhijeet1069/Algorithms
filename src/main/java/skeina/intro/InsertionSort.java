package skeina.intro;

import java.util.Arrays;

public class InsertionSort {
	
	public int[] sort(int[] arr) {
		int[] res = arr.clone();
		for(int i = 1; i < arr.length; i++) {
			int j = i;
			while((j>0) && (res[j] < res[j-1])) {
				int temp = res[j];
				res[j] = res[j-1];
				res[j-1] = temp;
				j--;
			}
		}
		System.out.println("Unsorted array = "+Arrays.toString(arr)+" Sorted array = "+Arrays.toString(res));
		return res;
	}
}
