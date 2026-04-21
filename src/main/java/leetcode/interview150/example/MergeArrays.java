package leetcode.graphs.interview150.example;

import java.util.Arrays;

public class MergeArrays {
    public static int[] merge(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] res = new int[m+n];
        int index = 0, i = 0, j = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                res[index] = nums1[i];
                i++;
            }
            else{
                res[index] = nums2[j];
                j++;
            }
            index++;
        }

        while (i < m){
            res[index] = nums1[i];
            i++;
            index++;
        }

        while (j < n){
            res[index] = nums2[j];
            j++;
            index++;
        }
        return res;
    }

    public static void main(String[] args) {
       int[] arr1 = {1,3,5,9};
       int[] arr2 = {2,4,6,8,10,11};
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }
}
