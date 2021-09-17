package Leetcode.Tutorial.Array;

public class EvenNumberofDigits {
    static int evenNumberOfDigits(int[] nums) {
        int count = 0;
        boolean isEven;
        for (int i = 0; i < nums.length; i++) {
            isEven = false;
            if (nums[i] > 9)  {
                while(nums[i] > 9) {
                    nums[i] /= 10;
                    isEven = !isEven;
                }
            }
            if(isEven) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(evenNumberOfDigits(nums));
    }
}
