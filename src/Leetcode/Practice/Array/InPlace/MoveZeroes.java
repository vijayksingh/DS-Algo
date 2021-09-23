package Leetcode.Practice.Array.InPlace;

public class MoveZeroes {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0 && nums[slow] != 0) {
                fast++;
                slow++;
            } else if (nums[fast] != 0 && nums[slow] == 0) {
                swap(nums, slow, fast);
                slow++;
            } else {
                fast++;
            }
        }
    }

    public static void main(String[] args) {

    }
}
