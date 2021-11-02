package com.leetcode2021;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2021-07-08 0:47
 */
public class LeetCode_243 {
    public boolean isAnagram(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            }
        }
        for (Character character : map.keySet()) {
            if (map.get(character) > 0) {
                return false;
            }
        }
        return true;
    }

}
