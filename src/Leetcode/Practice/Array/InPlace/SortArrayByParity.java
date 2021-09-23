package Leetcode.Practice.Array.InPlace;

public class SortArrayByParity {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int[] sortArrayByParity(int[] nums) {
        for (int i = 0, j = nums.length-1; i < j;) {
            // In case both pointers are even
            if(nums[i] % 2 == 0 && nums[j] % 2 == 0) {
                i++;
            // In case i is odd and j is even swap 'em
            } else if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                swap(nums, i, j);
                i++;
                j--;
            // Otherwise just bringing j back
            } else {
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {

    }
}
