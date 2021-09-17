package Leetcode.Tutorial.Array;

public class MaxConsecutiveOnes {
    static int maxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                if(count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(maxConsecutiveOnes(nums));
    }
}
