package Educative.DSInJava.Array;

import java.util.Arrays;

// Challenge 3: https://www.educative.io/module/lesson/data-structures-in-java/39Av4wzO67M
public class SumOfN {
    static int[] findSum(int[] arr, int n) {
        int i = 0, j = arr.length-1;
        Arrays.sort(arr);

        while (i < j) {
            if ((arr[i] + arr[j]) > n) j--;
            else if ((arr[i] + arr[j]) < n) i++;
            else return new int[]{arr[i], arr[j]};
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int value = 27;
        System.out.println(Arrays.toString(findSum(arr, value)));
    }
}
