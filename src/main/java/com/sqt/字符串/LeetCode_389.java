package com.sqt.字符串;

import java.util.Arrays;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-06-21 2:33
 * <p>
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * <p>
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * <p>
 * 请找出在 t 中被添加的字母。
 */
public class LeetCode_389 {

    public char findTheDifference(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        char res = 0;
        for (int i = 0; i < sArray.length; i++) {
          res ^= sArray[i];
        }
        for (char c : tArray) {
          res ^= c;
        }
        return res;
    }
}
