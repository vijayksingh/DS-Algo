package Leetcode.Practice.Array;

public class MissingNumber {
    static int missingNumber(int[] nums) {
        int sum = (int) (nums.length* ((float) (nums.length + 1)/2));
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(missingNumber(nums));
    }
}
