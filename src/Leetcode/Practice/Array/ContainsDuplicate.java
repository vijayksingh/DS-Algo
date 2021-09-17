package Leetcode.Practice.Array;

import java.util.Arrays;

public class ContainsDuplicate {
    // Solution 1 with Sorting Approach
    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean result = false;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                result = true;
                break;
            }
        }
        return result;
    }

    static boolean containsDuplicate2(int[] nums) {
        int count = 0;

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2, 3, 1};
    }
}
