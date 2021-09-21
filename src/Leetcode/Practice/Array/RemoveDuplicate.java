package Leetcode.Practice.Array;

import java.util.Arrays;

/*
Approach:
- Take two pointers fast and slow. both start at 0
- Fast will move forward and look for duplicates, if encountered it will keep moving forward until it reaches non duplicate
- Replace the next element to slow pointer with the non duplicate.
- Now fast will start looking for duplicate of this pointer. keep doing it until fast reach till the end.
 */
public class RemoveDuplicate {

    public static int removeDuplicates(int[] nums) {
        int fast = 0, slow = 0, count=0;
        boolean duplicate = false;
        for(slow = 0; fast < nums.length; fast++) {
            if(nums[slow] == nums[fast] && fast != slow)
                duplicate = true;
            if(nums[slow] != nums[fast] && duplicate) {
                slow++;
                count++;
                nums[slow] = nums[fast];
            }
            if(!duplicate) {
                slow = fast;
            }
            System.out.println(slow);
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {0,8};
        System.out.println(removeDuplicates(nums));
    }
}
