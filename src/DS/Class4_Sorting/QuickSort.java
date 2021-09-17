package DS.Class4_Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSort {
    static void quickSort(List<Integer> arr, int lo, int hi) {
        if(lo<hi) {
            int splitPoint = partition(arr, lo, hi);
            quickSort(arr, lo, splitPoint);
            quickSort(arr, splitPoint + 1, hi);
        }
    }
    static int partition(List<Integer> arr, int lo, int hi) {
        int pivot = arr.get(hi-1);
        int i = lo-1;
        for (int j = lo; j < hi; j++)
            if (arr.get(j) < pivot)
                Collections.swap(arr, arr.get(++i), arr.get(j));
        Collections.swap(arr, arr.get(++i), arr.get(hi));
        return i;
    }

    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(0,5,3,4,2,1);
        quickSort(arr, 0, 6);
        System.out.println(arr);
    }
}
