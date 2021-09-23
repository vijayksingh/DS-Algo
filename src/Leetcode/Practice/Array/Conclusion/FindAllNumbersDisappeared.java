package Leetcode.Practice.Array.Conclusion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Ahha
public class FindAllNumbersDisappeared {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i])-1] = Math.abs(nums[Math.abs(nums[i])-1]) * -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= 0) {
                list.add(i+1);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}).toString());
    }
}
