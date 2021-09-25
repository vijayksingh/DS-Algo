package Leetcode.Practice.String;

import java.util.Arrays;

public class ReverseString2 {
    public static void reverseString(char[] s, int lo, int hi) {
        System.out.println("lo " + lo + " hi " + hi);
        while(lo < hi) {
            char temp = s[lo];
            s[lo] = s[hi];
            s[hi] = temp;
            lo++;
            hi--;
        }
    }
    public static String reverseStr(String s, int k) {
        char[] word = s.toCharArray();
        for(int i = 0; i+k <= s.length(); i += k) {
            reverseString(word, i, i+k-1);
        }
        return new String(word);
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }
    // TODO: Can't comprehend the question, do it later
}
