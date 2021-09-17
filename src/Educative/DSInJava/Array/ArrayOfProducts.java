package Educative.DSInJava.Array;

import java.util.Arrays;

public class ArrayOfProducts {
    static int[] findProduct(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    result[i] *= arr[j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(findProduct(arr)));
    }
}
