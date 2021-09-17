package Leetcode.Practice.BinarySearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0; int high = arr.length;
        while(low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) high = mid;
            else low = mid+1;
        }
        return -1;
    };

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{-1,0,3,5,9,12}, 9));
    }
}
