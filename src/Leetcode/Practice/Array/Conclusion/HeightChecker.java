package Leetcode.Practice.Array.Conclusion;

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] nums) {
        int[] result = nums.clone();
        Arrays.sort(result);

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != result[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
