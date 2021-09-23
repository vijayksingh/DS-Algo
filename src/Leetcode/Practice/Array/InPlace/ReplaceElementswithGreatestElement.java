package Leetcode.Practice.Array.InPlace;

import java.util.Arrays;

public class ReplaceElementswithGreatestElement {
    public static int[] replaceElements(int[] nums) {
        int maxSoFar = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (maxSoFar < nums[i]) {
                int temp = nums[i];
                nums[i] = maxSoFar;
                maxSoFar = temp;
            } else {
                nums[i] = maxSoFar;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                replaceElements(
                        new int[]{17, 18, 5, 4, 6, 1}))
        );
    }
}
