package com.sqt.字符串;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-07-01 22:15
 * <p>
 * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 * <p>
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abc"
 * 输出: 3
 * 解释: 三个回文子串: "a", "b", "c".
 * 示例 2:
 * <p>
 * 输入: "aaa"
 * 输出: 6
 * 说明: 6个回文子串: "a", "a", "a", "aa", "aa", "aaa".
 */
public class LeetCode_647 {

    public static void main(String[] args) {
        countSubstrings("aaa");
    }

    public static int countSubstrings(String s) {
        char[] chars = s.toCharArray();
        int res = chars.length;
        boolean[][] dp = new boolean[chars.length][chars.length];
        for (int i = 0; i < chars.length; i++) {
            dp[i][i] = true;
        }
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == chars[j]) {
                    if (j - i == 1) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }

                } else {
                    dp[i][j] = false;
                }
                if (dp[i][j]) {
                    res++;
                }
            }
        }
        return res;
    }
}
