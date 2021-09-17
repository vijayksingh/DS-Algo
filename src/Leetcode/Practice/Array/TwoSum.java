package Leetcode.Practice.Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int[] clone = nums.clone();
        Arrays.sort(clone);
        int i = 0, j = clone.length-1;
        // Find the two elements whose sum is equal to the target
        while(i < j) {
            if(clone[i] + clone[j] > target) {
                j--;
            } else if (clone[i] + clone[j] < target) {
                i++;
            } else {
                result = new int[]{clone[i], clone[j]};
                break;
            }
        }

        // Found the first and second index in the original array.
        /*
        Taking care of 2 scenarios
        - In case first element and second element are same so they don't have same indexes.
        - In case the index found is equal to another element and therefore as a side-effect updating to another index.
         */
        boolean zeroFound = false, firstFound = false;
        for (int k = 0; k < nums.length; k++) {
            if(result[0] == nums[k] && !zeroFound) {
                result[0] = k;
                zeroFound = true;
            }
            if((result[1] == nums[k]) && !firstFound) {
                result[1] = k;
                firstFound = true;
            }
            if(zeroFound && firstFound) break;
        }
        System.out.println(Arrays.toString(result));

        if(result[0] == result[1]) {
            int value = nums[result[0]];
            for (int k = 0; k < nums.length; k++) {
                if(value == nums[k] && result[1] != k) {
                    result[1] = k;
                }
            }
        }

        return result;
    }

    static int[] twoSumMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        map.put(0, nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (map.get(i) == target - map.get(i)) {
                //TODO: Complete this
            }
        }
        return result;
    }
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(twoSum(new int[]{1, 3, 4, 2},6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,3},6)));
    }
}
