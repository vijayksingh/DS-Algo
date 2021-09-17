package DS.Class4_Sorting_Assignments;

import java.util.Arrays;

public class Sort_Colors {
    static void sortColors(int[] nums) {
        int onesCount = 0, twosCount = 0, zerosCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zerosCount++;
            } else if (nums[i] == 1) {
                onesCount++;
            } else {
                twosCount++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (zerosCount > 0) {
               zerosCount--;
               nums[i] = 0;
            } else if (onesCount > 0) {
                onesCount--;
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums =  {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
