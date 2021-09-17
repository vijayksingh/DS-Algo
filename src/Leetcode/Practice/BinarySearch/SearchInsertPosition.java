package Leetcode.Practice.BinarySearch;

// Reference https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int low = 0, hi = nums.length-1;
        while (low <= hi) {
            int mid = low + hi-low/2;
            // Point to remember we always compare for value greater than target
            if (nums[mid] >= target) {
                hi = mid-1;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
        public static void main(String[] args) {
            System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
    }
}
