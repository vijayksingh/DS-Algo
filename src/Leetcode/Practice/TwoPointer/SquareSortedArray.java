package Leetcode.Practice.TwoPointer;

import java.util.Arrays;

public class SquareSortedArray {
    public static final <T> void swap (int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    static int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        for (int i = 0, j = nums.length-1; i <= j; ) {
            if(nums[i] > nums[j]) {
                swap(nums, i, j);
            }
            j--;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }
        return nums;
    };


    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -3, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7,-3,2,3,11})));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-10,-9, -8, -7})));
    }
}
