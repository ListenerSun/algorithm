package com.sqt;

import java.util.*;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-05-12 9:18 AM
 *
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 *
 * 示例:
 *
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 *
 * 使用 Hash 表
 *
 */
public class LeetCode_49 {

    public static void main(String[] args) {

    }



    public static List<List<String>> groupAnagrams(String[] strs) {
        if (null == strs || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String,List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!map.containsKey(key)) {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
