package Leetcode.Practice.Array;

import java.util.Arrays;
// Reference : https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int[] nums = arr.clone();
        for (int i = 0, j = 0; i < nums.length && j < arr.length; i++, j++) {
            arr[j] = nums[i];
            if(nums[i] == 0 && j+1 < arr.length) {
                j++;
                arr[j] = nums[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,0,0,0,0,0,0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
