package algorithm.c1.s1.theory.binSearch;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.io.File;
import java.util.Arrays;

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

	public static int[] readAllInts(String fileName){
		File whitelistFile = new File(fileName);
		In in = new In(whitelistFile);
        int[] arr = in.readAllInts();
//		System.out.println("readAllInts():: "+fileName);
//		for(int num : arr)
//			System.out.print(num+" ");
//		System.out.println();
		return arr;
	}
	
	public static void main(String[] args) {
		int[] whitelist = readAllInts("src/main/resources/algorithm/c1/s1/theory/binSearch/largeAllowlist.txt");
		Arrays.sort(whitelist);
		int[] keyList = readAllInts("src/main/resources/algorithm/c1/s1/theory/binSearch/largeText.txt");

		for(int key : keyList){
			if(rank(key,whitelist) < 0)
				StdOut.println("Not found : "+key);
		}
	}
}
