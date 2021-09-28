package Leetcode.Practice.String;

public class ReverseString {
    public void reverseString(char[] s) {
        int lo = 0, hi = s.length-1;
        while(lo < hi) {
            char temp = s[lo];
            s[lo] = s[hi];
            s[hi] = temp;
            lo++;
            hi--;
        }
    }

    public static void main(String[] args) {

    }
}
