package Leetcode.Practice.Array.Conclusion;

import java.util.Arrays;

public class ThirdMaximum {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) count++;
            if(count == 3) return nums[0];

        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{2,2,2,2, 2, 1}));
    }
}
