package Leetcode.Practice.BitManipulation;

public class HammingDistance {
    // Approach using inbuilt function
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    // My approach
    public int hammingDistance2(int x, int y) {
        int n = x ^ y;
        int count = 0;
        while(n > 0) {
            count++;
            n = n & n-1;
        }
        return count;
    }

    // Another approach using right shift to move through all the set bits
    public int hammingDistance3(int x, int y) {
        int n = x ^ y;
        int count = 0;
        while(n > 0) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }
}
