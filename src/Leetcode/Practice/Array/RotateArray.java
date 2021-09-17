package Leetcode.Practice.Array;

import java.util.Arrays;

public class RotateArray {
    static void reverse(int[] nums,int start, int length) {
        length = length-1;
        for (int i = start; i < length; i++) {
            int temp = nums[i];
            nums[i] = nums[length];
            nums[length] = temp;
            length--;
        }
    }

    static void rotate(int[] nums, int k) {
        if (nums.length >= 1) {
            int length = nums.length;
            reverse(nums, 0,length-k);
            reverse(nums, length-k, length);
            reverse(nums, 0, length);
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(array, k);
        System.out.println(Arrays.toString(array));
    }
}
