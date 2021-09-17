package DS.Class4_Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
    static List<Integer> bubbleSort(List<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n-1; i++) {
            boolean swap = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr.get(j) > arr.get(j+1)) {
                    Collections.swap(arr, j, j+1);
                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(bubbleSort(Arrays.asList(5,1,2,3,4)));
    }
}
