package Leetcode.Practice.Array;

public class ValidMountain {
    public boolean validMountainArray(int[] nums) {
        boolean result = false;
        String state = "INITIAL";
        for (int i = 0; i < nums.length-1; i++) {
            // FROM Initial State -> Only two possible state (INC, DEC, SAME)
            if(nums[i] > nums[i+1] && state == "INITIAL") {
                result = false;
                break;
            } else if (nums[i] == nums[i+1]) {
                result = false;
                break;
            }
            if(nums[i] < nums[i+1] && state == "INITIAL") state = "INC";

            // FROM INC state -> Three possible state (INC, DEC, Same)
            if(nums[i] > nums[i+1] && state == "INC" && i != 0) {
                state = "DEC";
                result = true;
            } else if (nums[i] < nums[i+1] && state == "DEC") {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
