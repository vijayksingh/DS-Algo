package Educative.DSInJava.Array;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    static int[] mergeArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] result = new int[length];
        int pointer1 = 0;
        int pointer2 = 0;
        for (int i = 0; i < length; i++) {
            if (pointer1 == nums1.length) result[i] = nums2[pointer2++];
            else if (pointer2 == nums2.length) result[i] = nums1[pointer1++];
            else if (nums1[pointer1] < nums2[pointer2]) result[i] = nums1[pointer1++];
            else result[i] = nums2[pointer2++];
         }
        return result;
    }

    public static void main(String[] args) {
       int[] arr1 = {1, 3, 4, 5};
       int[] arr2 = {2, 6, 7, 8};
        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));
    }
}
