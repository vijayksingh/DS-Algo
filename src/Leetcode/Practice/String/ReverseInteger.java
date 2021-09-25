package Leetcode.Practice.String;

public class ReverseInteger {
    public static String reverseString(char[] s) {
        int lo = 0, hi = s.length-1;
        while(lo < hi) {
            char temp = s[lo];
            s[lo] = s[hi];
            s[hi] = temp;
            lo++;
            hi--;
        }
        return new String(s);
    }

    public static int reverse(int x) {
        String s = Integer.toString(x);
        char symbol;
        if(s.charAt(0) == '-' || s.charAt(0) == '+') {
            symbol = s.charAt(0);
            s = s.substring(1);
        }
        return x;
    }
    public static void main(String[] args) {
        // TODO : Complete this.
    }
}
