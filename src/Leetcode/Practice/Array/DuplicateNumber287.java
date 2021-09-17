package Leetcode.Practice.Array;

public class DuplicateNumber287 {
    static int duplicateNumber(int[] nums) {
        int sum = (int) ((nums.length-1)* ((float) (nums.length)/2));
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        return Math.abs(sum);
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(duplicateNumber(nums));
    }
}
