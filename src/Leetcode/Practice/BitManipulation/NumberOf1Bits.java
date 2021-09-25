package Leetcode.Practice.BitManipulation;

public class NumberOf1Bits {
    // Works with C++ but doesn't work with JAVA
    public int hammingWeight(int n) {
        int count = 0;
        while(n > 0) {
            count++;
            n = n & n-1;
        }
        return count;
    }


    public static void main(String[] args) {

    }
}
