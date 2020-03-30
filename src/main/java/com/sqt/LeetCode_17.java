package com.sqt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * <p>
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-12-26 23:41
 */
public class LeetCode_17 {

    public List<String> letterCombinations(String digits) {

        final char[] chars = digits.toCharArray();
        if (chars.length < 2) {
            throw new IllegalArgumentException("param input error !");
        }
        return null;
    }
}