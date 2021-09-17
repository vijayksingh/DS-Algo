package DS.Class4_Sorting;

import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    static List<Integer> insertionSort(List<Integer> arr) {
        // We will start from i = 1 to n and will pick each element 1 at a time
        for (int i = 1; i < arr.size(); i++) {
            // We are starting from 1st position assuming 0 is already in sorted array
            int key = i;
            // The picked element is value and we will place it in our sorted region of the array.
            int value = arr.get(i);

            // This loop will shift all value to the right in sorted array and eventually will
            // terminate at the position where our new element will be placed.
            while (key > 0 && arr.get(key-1) > value) {
                arr.set(key, arr.get(key-1));
                key--;
            }
            // Putting the new value to its correct position in sorted array.
            arr.set(key, value);
        }
        return arr;
    };

    public static void main(String[] args) {
        System.out.println(insertionSort(Arrays.asList(0,5,3,4,2,1)));
    }
}
