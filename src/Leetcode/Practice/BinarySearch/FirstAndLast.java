package Leetcode.Practice.BinarySearch;
// Problem Reference : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstAndLast {
    public static int lowerBound(int[] arr, int target) {
        int lo = 0, hi = arr.length-1, result = -1;
        while (lo <= hi) {
            int mid = lo + (hi-lo) / 2;
            if (arr[mid] >= target) {
                hi = mid-1;
            }
            else lo = mid+1;
            if(arr[mid] == target) result = mid;
        }
        return result;
    };

    public static int upperBound(int[] arr, int target) {
        int lo = 0, hi = arr.length-1, result = -1;
        while (lo <= hi) {
            int mid = lo + (hi-lo) / 2;
            if (arr[mid] <= target) {
                lo = mid+1;
            }
            else
                hi = mid-1;
            if(arr[mid] == target) result = mid;
        }
        return result;
    };


    public static void main(String[] args) {
        int lo = lowerBound(new int[]{1,1}, 1);
        int hi = upperBound(new int[]{1,1}, 1);
        System.out.println("lo = " + lo);
        System.out.println("hi = " + hi);
    }
}
