package algorithm.c1.s2.exercises;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.io.File;
import java.util.Arrays;

public class ModifiedBinarySearch {

    public static int rank(int key, int[] a) {
        Counter counter = new Counter("keys");
        int lo = 0;
        int hi = a.length-1;
        int index = -1;
        while(lo <= hi) {
            int mid = lo+(hi-lo)/2;
            counter.increment();
            if(key<a[mid])
                hi = mid-1;
            else if(key > a[mid])
                lo = mid+1;
            else {
                index = mid;
                break;
            }
        }
        StdOut.println("List length = "+a.length+" No of keys examined = "+counter.tally());
        return index;
    }

    public static int[] readAllInts(String fileName){
        File whitelistFile = new File(fileName);
        In in = new In(whitelistFile);
        int[] arr = in.readAllInts();
		System.out.println("readAllInts():: "+fileName);
		for(int num : arr)
			System.out.print(num+" ");
		System.out.println();
        return arr;
    }

    public static void main(String[] args) {
        int[] whitelist = readAllInts("src/main/resources/algorithm/c1/s1/theory/binSearch/largeAllowlist.txt");
        Arrays.sort(whitelist);
        int key = 32;
        StdOut.println(rank(key,whitelist));
    }
}
