package algo.intro.textbook;

/**
 * Running time complexity = O(n^2)
 * */

public class SelectionSort {
	public static int[] sort(int s[]) {
		
		int[] res = s.clone();
		
		for(int i = 0; i < res.length; i++) {
			int min = i;
			for(int j = i+1; j < res.length; j++) {
				if(res[j] < res[min])
					min = j;
			}
			int temp = res[i];
			res[i] = res[min];
			res[min] = temp;
		}
		return res;
	}
}
