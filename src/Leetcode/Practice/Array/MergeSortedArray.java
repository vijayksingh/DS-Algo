package Leetcode.Practice.Array;

public class MergeSortedArray {
    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0) return nums2;
        if(n == 0) return nums1;

        int[] result = new int[m+n];
        int index = 0, i = 0, j = 0;
        for (i = 0, j = 0; i < m && j < n; i++, j++) {
            if(nums1[i] < nums2[j]) {
                result[index] = nums1[i];
                j--;
                index++;
            } else {
                result[index] = nums2[j];
                i--;
                index++;
            }
        }

        while(i < m) {
            result[index] = nums1[i];
            index++;
        }
        while(j < n) {
            result[index] = nums2[j];
            index++;
        }
        return nums1;
    }
    public static void main(String[] args) {
        // TODO : Cop
    }
}
