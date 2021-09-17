package DS.Class4_Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SelectionSort {
    static List<Integer> selectionSort(List<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = 0; j < n; j++) {
                if (arr.get(j) < arr.get(min))
                    min = j;
            }
            if (i != min)
                Collections.swap(arr, i, min);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(selectionSort(Arrays.asList(0,5,3,4,2,1)));
    }
}
