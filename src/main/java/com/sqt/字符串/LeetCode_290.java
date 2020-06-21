package com.sqt.字符串;

import java.util.*;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-06-21 2:56
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 * <p>
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 * <p>
 * 示例1:
 * <p>
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入:pattern = "abba", str = "dog cat cat fish"
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: pattern = "aaaa", str = "dog cat cat dog"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: pattern = "abba", str = "dog dog dog dog"
 * 输出: false
 */
public class LeetCode_290 {

    public boolean wordPattern(String pattern, String str) {
        String[] strArray = str.split(" ");
        if (pattern.length() != strArray.length) {
            return false;
        }
        Map<Object, Integer> map = new HashMap<>();
        for (int i = 0; i < strArray.length; i++) {
            Integer num1 = map.put(strArray[i], i);
            Integer num2 = map.put(pattern.charAt(i), i);
            if (!Objects.equals(num1, num2)) {
                return false;
            }
        }
        return true;
    }
}
