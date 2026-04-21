package algo.intro.textbook;

import java.util.Arrays;
import java.util.List;

public class LeftRotation {
	
	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		int len = arr.size();
		d = d%len;
		
		Integer[] rotate = new Integer[len];
		
		for (int i = d; i < len; i++) 
			rotate[i-d] = arr.get(i);
		
		for (int i = 0; i < d; i++) 
			rotate[len-d+i] = arr.get(i);
		
		return Arrays.asList(rotate);
	}
}
