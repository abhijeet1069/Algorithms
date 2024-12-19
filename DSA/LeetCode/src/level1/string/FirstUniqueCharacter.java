package level1.string;

import java.util.Arrays;

public class FirstUniqueCharacter {
	
	public static final int EMPTY = -1;
	public static final int REPEAT = -2;
	
	public static int firstUniqChar(String s) {
        int[] arr = new int[26];
        Arrays.fill(arr, EMPTY);
        for(int i = 0; i < s.length(); i++) {
        	int index = s.charAt(i)-'a';
        	if(arr[index] == EMPTY)
        		arr[index] = i;
        	else
        		arr[index] = REPEAT;
        }
        int minIndex = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length; i++) {
        	if(arr[i] != REPEAT && arr[i] != EMPTY) {
        		if(minIndex > arr[i]) {
        			minIndex = arr[i];
        		}
        	}
        }
        if(minIndex == Integer.MAX_VALUE)
        	return -1;
        else
        	return minIndex;
    }
	
	public static void main(String[] args) {
		String str = "aabb";
		System.out.println(firstUniqChar(str));
	}
}
