package com.sqt.字符串;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-06-22 1:34
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class LeetCode_3 {

    public static void main(String[] args) {
        String s = null;
        s.length();
    }

    public int lengthOfLongestSubstring(String s) {
        if (null == s) {
            return 0;
        }
        int i = 0, j = 0, res = 0;
        Set<Character> set = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                res = Math.max(res, j - i + 1);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return res;
    }
}
