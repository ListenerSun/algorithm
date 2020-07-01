package com.sqt.字符串;

import java.util.Stack;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-06-29 2:48
 * <p>
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案
 */
public class LeetCode_5 {

    public static void main(String[] args) {
        LeetCode_5 l = new LeetCode_5();
        String s = "a";
        String s1 = l.longestPalindrome(s);
    }

    public String longestPalindrome(String s) {
        char[] array = s.toCharArray();
        String res = "";
        int length = 1;
        int begin = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (valid(i, j, array) && j - i + 1 > length) {
                    begin = i;
                    length = j - i + 1;
                }
            }
        }
        return s.substring(begin, begin + length);
    }

    public boolean valid(int left, int right, char[] arr) {
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
