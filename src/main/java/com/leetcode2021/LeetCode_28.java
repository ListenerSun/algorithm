package com.leetcode2021;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2021-03-28 1:59
 */
public class LeetCode_28 {

    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if (n == 0) {
            return 0;
        }
        for (int i = 0, j = 0; i + j< m && j < n;) {
            if (haystack.charAt(i + j) != needle.charAt(j)) {
                i++;
                j = 0;
            } else {
                j++;
            }
            if (j == n) {
                return i;
            }
        }
        return -1;
    }
}



