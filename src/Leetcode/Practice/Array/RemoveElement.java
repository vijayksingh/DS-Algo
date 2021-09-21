package Leetcode.Practice.Array;

public class RemoveElement {
    public static void removeAt(int index, int[] nums, int count) {
        for (int i = index; i < nums.length-count; i++) {
            nums[i] = nums[i+1];
        }
    }

    public static  int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length-count; i++) {
            if(nums[i] == val) {
                System.out.println(i);
                count++;
                removeAt(i, nums, count);
                i--;
            }
        }
        return nums.length-count;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
    }
}

// Ahha Moment -> While left shifting you should remember that you can copy a value from i+1 pos which needs
// be deleted and if you increment the pointer you will be left with a value which needs to be deleted but somehow got
// skipped