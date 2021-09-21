package Leetcode.Practice.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckForDouble {
    static boolean checkIfExist(int[] nums) {
        Set<Double> set = new HashSet<Double>();
        boolean result = false;

        for (int num: nums)
            if(set.contains((double) num/2) || set.contains((double) num*2)) {
                System.out.println(num);
                result = true;
                break;
            } else {
                set.add((double) num);
            }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{14,1,7}));
    }
}
